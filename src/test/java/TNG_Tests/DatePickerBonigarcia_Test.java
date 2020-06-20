package TNG_Tests;

import PageObject.DatepickerPage;
import PageObject.JQueryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePickerBonigarcia_Test {
    WebDriver driver;
    String baseUrl;
    JQueryPage jQueryHPage;
    DatepickerPage datepickerPage;

    @BeforeClass
    public void setup() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Berdi\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
       // WebDriverManager.chromedriver().setup();
        baseUrl = "https://jqueryui.com/";
      //  driver = new ChromeDriver();
        driver = DriverMgr.getDriver();
        jQueryHPage = new JQueryPage(driver);
        datepickerPage = new DatepickerPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void selectDateTest() throws InterruptedException {
        jQueryHPage.clickDatePicker();
        jQueryHPage.switchFrame();
        datepickerPage.clickDatePick();
       // datepickerPage.getAllDates("4");
        datepickerPage.getAllDates(System.getProperty("date"));
        Thread.sleep(5000);
    }

}
