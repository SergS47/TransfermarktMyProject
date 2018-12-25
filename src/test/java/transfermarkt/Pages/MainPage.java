package transfermarkt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by сергей on 13.10.2018.
 */
public class MainPage extends AbstractPage {
    public static final String MAINPAGE = "https://www.transfermarkt.com";

    @FindBy(xpath = "//*[@id='liveWidget']/div/div[1]/h2")
    protected static WebElement liveScores;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public static boolean titleOfLiveScores(){
        return liveScores.isDisplayed();
    }
}