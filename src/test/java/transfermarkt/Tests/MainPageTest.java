package transfermarkt.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import transfermarkt.Pages.MainPage;

/**
 * Created by сергей on 14.10.2018.
 */
public class MainPageTest extends BaseTest {
    MainPage mainpage = new MainPage(getDriver());

    @BeforeTest
    public void openMain(){
       BaseTest.initDriver(mainpage.MAINPAGE);
    }

    @Test
    public void checkLiveScoresTitle() {
       softAssert.assertTrue(mainpage.titleOfLiveScores(), "LIVE SCORES Title is presented ");
       softAssert.assertAll();
    }
    @Test
    public void checkAllConfederationAreDisplayed() {
        for (int i = 1; i <= 6; i++) {
            WebElement conf = driver.findElement(By.xpath("//*[@id='konfoederationenbox']/a[" + i + "]"));
            //softAssert.assertTrue(conf.isDisplayed());
            softAssert.assertAll();
        }
    }
    @DataProvider(name = "ConfedTest")
    public static Object[][] ConfedTest() {
        return new Object[][] {
                {1, "https://www.transfermarkt.com/wettbewerbe/europa"},
                {2, "https://www.transfermarkt.com/wettbewerbe/amerika"},
                {3, "https://www.transfermarkt.com/wettbewerbe/amerika"},
                {4, "https://www.transfermarkt.com/wettbewerbe/asien"},
                {5, "https://www.transfermarkt.com/wettbewerbe/afrika"},
                {6, "https://www.transfermarkt.com/wettbewerbe/asien"}
        };
    }
    @Test (dataProvider="ConfedTest")
     public void clickOnEachConfederation(int id, String linkToConf){
      WebElement confederation = driver.findElement(By.xpath("//*[@id='konfoederationenbox']/a[" + id + "]/div"));
        confederation.click();
        softAssert.assertTrue(driver.getCurrentUrl().equals(linkToConf), "URL is " + linkToConf + " and coincides with  " + driver.getCurrentUrl());
        softAssert.assertAll();
        driver.navigate().to(mainpage.MAINPAGE);
     }
}