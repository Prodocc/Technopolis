package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FriendsPage extends BasePage {

    @Override
    boolean check(WebDriver driver) {
        throw new UnsupportedOperationException();
    }

    @FindBy(xpath = ".//div[@class='user-grid-card']")
    WebElement friendsCard;


}
