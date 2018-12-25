package transfermarkt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by сергей on 20.10.2018.
 */
public abstract class AbstractPage {
    public static final int DEFAULT_TIME_OUT_IN_SECONDS = 60;

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, DEFAULT_TIME_OUT_IN_SECONDS);
        PageFactory.initElements(driver, this);
    }
}
