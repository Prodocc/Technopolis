package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @Override
    boolean check(WebDriver driver) {
        throw new UnsupportedOperationException();

    }

    @FindBy(xpath = ".//input[@id='field_email']")
    WebElement login_field;
    @FindBy(xpath = ".//input[@id='field_password']")
    WebElement password_field;
    @FindBy(xpath = ".//input[@value='Войти']")
    WebElement submit_button;

    public void enter(String login, String password) {
        login_field.sendKeys(login);
        password_field.sendKeys(password);
        submit_button.click();
    }

}
