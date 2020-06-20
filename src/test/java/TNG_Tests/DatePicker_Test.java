package TNG_Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObject.DatepickerPage;
import PageObject.JQueryPage;

public class DatePicker_Test{
    WebDriver driver;
    String baseUrl;
    JQueryPage jQueryHPage;
    DatepickerPage datepickerPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Berdi\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        baseUrl = "https://jqueryui.com/";
        driver = new ChromeDriver();
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
//        System.setProperty("date","5");
        // datepickerPage.getAllDates("4");
        datepickerPage.getAllDates(System.getProperty("date"));
        Thread.sleep(5000);
    }
}



