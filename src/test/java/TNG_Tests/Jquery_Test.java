package TNG_Tests;

import PageObject.ControlGroupPage;
import PageObject.JQueryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jquery_Test {
    WebDriver driver;
    String baseUrl;
    JQueryPage jQueryHPage;
    ControlGroupPage controlGroupPage;
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Berdi\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        baseUrl = "https://jqueryui.com/";
        driver = new ChromeDriver();
        jQueryHPage = new JQueryPage(driver);
        controlGroupPage = new ControlGroupPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void clickControlGroup() {
        jQueryHPage.clickCtrlGroup();
        jQueryHPage.switchFrame();
        Assert.assertEquals(controlGroupPage.headerText(), "Controlgroup");
    }
}