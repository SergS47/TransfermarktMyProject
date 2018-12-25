package transfermarkt.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

/**
 * Created by сергей on 20.10.2018.
 */
public abstract class BaseTest {
    protected static WebDriver driver = new FirefoxDriver();
    protected static SoftAssert softAssert = new SoftAssert();

    public WebDriver getDriver() {
       return driver;
   }

    protected static void initDriver (String website){
        driver.manage().window().maximize();
        driver.get(website);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @AfterTest
    protected static void close(){
        driver.quit();
    }
}
