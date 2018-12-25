package transfermarkt.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import transfermarkt.Pages.CompetitionEng;

/**
 * Created by сергей on 18.11.2018.
 */
public class CompetitionEngTest extends BaseTest {
    CompetitionEng competition = new CompetitionEng (getDriver());

    @BeforeTest
    public void openLatestPage(){
        BaseTest.initDriver(competition.COMPETITIONENG);
    }
    @Test
    public void checkNewsOfApl(){
        competition.NewsofAplTab();
        softAssert.assertTrue(competition.headerOfNewsTab(), "Header of News is shown");
    }
    @Test
    public void checkTransfersOfApl(){
        competition.TransfersOfAplTab();
        softAssert.assertTrue(competition.headerOfTransfers(), "Header of Tranfers is shown");
        softAssert.assertAll();
    }
    @Test
    public void checkPrevTransfer(){
        competition.TransfersOfAplTab();
        softAssert.assertTrue(competition.firstTransfer(), "First transfer is shown");
        competition.clickOnPrevTranfer();
        softAssert.assertTrue(competition.lastTransfer(), "Last transfer is shown");
        softAssert.assertAll();
    }
    @Test
    public void checkmarkedValues(){
        competition.markedValuesOfAplTab();
        softAssert.assertTrue(competition.headerOfmarkedValues(), "Header of Marked Values is shown");
        softAssert.assertAll();
    }
}