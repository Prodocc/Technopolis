package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GroupsPage extends BasePage {

    WebDriver driver;




    public GroupsPage(WebDriver driver) {
        this.driver = driver;
        check(driver);
    }

    /**
     *
     */
    public void count() {
        int count1 = 0, count2 = 0, count3 = 0;

        List<WebElement> webElements = driver.findElements(By.id(""));
        for (WebElement elemet : webElements) {
            if (elemet.getText().endsWith("a")) {
                count1++;

            } else if (elemet.getText().endsWith("b")) {
                count2++;
            } else {
                count3++;
            }
        }


        int index = 0;
        while (index < webElements.size()) {
            String tmp = webElements.get(index).getText();
            char[] chars = tmp.toCharArray();
            switch (chars[chars.length-1]){
                //switch (tmp.charAt(tmp.length() - 1)) {
                case 'a':
                    count1++;
                    break;
                case 'b':
                    count2++;
                    break;
                default:
                    count3++;
            }
            index++;
            if(index > 100_000){
                break;
            }
        }

        /*for(int i = 0; i < webElements.size(); i++){
        }*/

    }

    @Override
    boolean check(WebDriver driver) {
        return false;
    }
}