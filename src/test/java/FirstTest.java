import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GroupsPage;
import tests.TestBase;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class FirstTest extends TestBase {
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://ok.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCase() throws Exception {
        driver.get(baseUrl + "/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");
        driver.findElement(By.id("field_email")).clear();
        driver.findElement(By.id("field_email")).sendKeys("technopolisbot");
        driver.findElement(By.id("field_password")).clear();
        driver.findElement(By.id("field_password")).sendKeys("technopolis16");
        driver.findElement(By.cssSelector("div.form-actions > div > input.button-pro.__wide")).click();

        GroupsPage groupsPage = new GroupsPage(driver);




        driver.findElement(By.linkText("Группы 41")).click();
        driver.findElement(By.cssSelector("span.add-stub_tx")).click();
        driver.findElement(By.cssSelector("div.create-group-dialog_tx")).click();
        driver.findElement(By.id("field_name")).clear();
        driver.findElement(By.id("field_name")).sendKeys("Group");
        driver.findElement(By.id("hook_FormButton_button_create")).click();
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