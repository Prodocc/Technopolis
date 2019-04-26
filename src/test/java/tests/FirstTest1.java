package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.GroupsPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class FirstTest1 extends TestBase {
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @FindBy(xpath = ".//input[@id='field_email']")
    WebElement field_email;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        baseUrl = "https://ok.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testCase() throws Exception {
        driver.get(baseUrl + "/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");
        field_email.clear();
        field_email.sendKeys("89812468024");
        //driver.findElement(By.xpath(".//input[@id='field_email']")).clear();
        //driver.findElement(By.xpath(".//input[@id='field_email']")).sendKeys("89812468024");
        driver.findElement(By.xpath(".//input[@id='field_password']")).clear();
        driver.findElement(By.xpath(".//input[@id='field_password']")).sendKeys("qwerty12345");
        driver.findElement(By.xpath(".//input[@value='Войти']")).click();
        System.out.println(driver.findElement(By.xpath(".//div[@class='online-fr_cards']")).getText());
        driver.findElement(By.xpath(".//div[@class='tico_txt'][text()='Друзья']")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}