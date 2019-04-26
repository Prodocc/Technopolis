package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMainPage extends BasePage {

    @Override
    boolean check(WebDriver driver) {
        throw new UnsupportedOperationException();

    }

    @FindBy(xpath = ".//div[@class='tico_txt'][text()='Друзья']")
    WebElement friend_button;

    public void clickToFriend() {
        friend_button.click();
    }
}
