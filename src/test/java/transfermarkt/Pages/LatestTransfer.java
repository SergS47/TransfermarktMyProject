package transfermarkt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by сергей on 04.11.2018.
 */
public class LatestTransfer extends AbstractPage {
    public static final String LATESTTRANSFER = "https://www.transfermarkt.com/statistik/letztetransfers";

    @FindBy(xpath = "//*[@id='main']/div[8]/div/div/div[1]/h2")
    private static WebElement title;

    @FindBy (xpath = ".//*[@id='main']/div[8]/div[1]/div/div[3]/a[2]/div/span")
    private static WebElement detailedTab;

    @FindBy (xpath = ".//*[@id='yw1_c5']/a")
    private static WebElement transferDateLink;

    @FindBy (xpath = ".//*[@id='yw1_c6']/a")
    private static WebElement marketValueLink;

     private static WebDriverWait wait;

    public LatestTransfer(WebDriver driver){
        super(driver);
    }

    public static boolean nameOfLatestTransfer(){
        return title.isDisplayed();
    }

    public void openDetailedTab(){
        detailedTab.click();
    }

    public static boolean transferDateLinkIsPresentedOnDetailedTab(){
        return transferDateLink.isDisplayed();
    }
    public static boolean marketValueLinkIsPresentedOnDetailedTab(){
        return marketValueLink.isDisplayed();
    }

    public void viewFirstTransfer(){
       // Actions action = new Actions(driver);
        transferDateLink.click();
       // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//*[text()=\"Jul 1, 2018\"]")));
     }
 }
