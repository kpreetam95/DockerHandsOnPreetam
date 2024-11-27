//Acts as a parent class for all the test classes
//TestNG annotations like BeforeClass, AfterClass, BeforeTest, AfterTest will cause redundancy
//so we'll add those piece of code here
package page_tests;

import base.AppConstants;
import com.aventstack.extentreports.App;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
    protected WebDriver driver;

    protected String browser;

    //private ChromeOptions co;

    private FirefoxOptions fo;

    @BeforeTest
    public void setupTest()
    {
        browser = AppConstants.browserName;

        if(browser.equalsIgnoreCase("chrome"))
        {
            if(AppConstants.platform.equalsIgnoreCase("local"))
            {
                //co.addArguments("--remote-allow-origins=*");
                WebDriverManager.chromedriver().setup();
                //driver = new ChromeDriver(co);
                driver = new ChromeDriver();
            }
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            if (AppConstants.platform.equalsIgnoreCase("local"))
            {
                fo.addArguments("--remote-allow-origins=*");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(fo);
            }
        }
        else
        {
            System.out.println("Browser name entered is not supported");
        }
    }


    @AfterTest
    public void tearDownTest()
    {
        driver.quit();
    }
}
