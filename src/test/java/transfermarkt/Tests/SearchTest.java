package transfermarkt.Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import transfermarkt.Pages.SearchPage;

/**
 * Created by сергей on 10.12.2018.
 */
public class SearchTest extends BaseTest {
    SearchPage searchpage = new SearchPage(getDriver());
    private static WebDriverWait wait;

   @FindBy(xpath = ".//*[@id='yw0']//*[contains(text(), 'Cristiano Ronaldo')]")
    protected static WebElement criRo;

    @BeforeTest
    public void openMain(){
        BaseTest.initDriver("https://www.transfermarkt.com");
    }
    @Test
    public void findCriro(){
        searchpage.mainSerach("cristiano ronaldo");
        //wait.until(ExpectedConditions.visibilityOf(criRo));
        softAssert.assertTrue(criRo.isDisplayed(),"Player was found");
        softAssert.assertAll();
    }
}

