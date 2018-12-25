package transfermarkt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by сергей on 17.11.2018.
 */
public class CompetitionEng extends AbstractPage {
    public static final String COMPETITIONENG = "https://www.transfermarkt.com/premier-league/startseite/wettbewerb/GB1";

    @FindBy(xpath = ".//*[@id='tabs']/ul/li[1]")
    private static WebElement newsTab;

    @FindBy(xpath = ".//*[@id='wettbewerbsstartseite']/div[2]/div[3]/div[1]")
    private static WebElement headerOfNewsTab;

    @FindBy(xpath =".//*[@id='tabs']/ul/li[2]")
    private static WebElement transfersTab;

    @FindBy(xpath =".//*[@id='tabs-2']/div/div[1]/span[1]/a")  //.//*[@id='tabs-2']/div/div[1]/span[1]
    private static WebElement transfersArrowPrev;

    @FindBy(xpath = ".//*[@id='tabs-2']/div/div[1]/p/span")
    private static WebElement headerOfTransfersTab;

    @FindBy(xpath =".//*[@id='tabs-2']/div/div[2]/div/div[1]/ul/li[1]")
    private static WebElement firstTransferInList;

    @FindBy(xpath =".//*[@id='tabs-2']/div/div[2]/div/div[1]/ul/li[10]")
    private static WebElement lastTransferInList;

    @FindBy(xpath =".//*[@id='tabs']/ul/li[3]")
    private static WebElement markedValuesTab;

    @FindBy(xpath =".//*[@id='tabs-3']/div[1]/p")
    private static WebElement headerOfValues;

    public CompetitionEng(WebDriver driver) {
        super(driver);
    }

    public void NewsofAplTab(){
        newsTab.click();
    }

    public static boolean headerOfNewsTab(){
        return headerOfNewsTab.isDisplayed();
    }

    public void TransfersOfAplTab(){
        transfersTab.click();
    }

    public static boolean headerOfTransfers(){
        return headerOfTransfersTab.isDisplayed();
    }

    public void clickOnPrevTranfer(){
        transfersArrowPrev.click();
    }
    public static boolean firstTransfer (){
        return firstTransferInList.isDisplayed();
    }
    public static boolean lastTransfer (){
        return lastTransferInList.isDisplayed();
    }
    public void markedValuesOfAplTab(){
        markedValuesTab.click();
    }
    public static boolean headerOfmarkedValues(){
        return headerOfValues.isDisplayed();
    }

}
