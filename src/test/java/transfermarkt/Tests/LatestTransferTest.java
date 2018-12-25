package transfermarkt.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import transfermarkt.Pages.LatestTransfer;

/**
 * Created by сергей on 04.11.2018.
 */
public class LatestTransferTest extends BaseTest {
    LatestTransfer latesttransfer = new LatestTransfer(getDriver());

    @BeforeTest
    public void openLatestPage() {
        BaseTest.initDriver(latesttransfer.LATESTTRANSFER);
    }

    @Test
    public void checkTitleOfPage() {
        softAssert.assertTrue(latesttransfer.nameOfLatestTransfer(), "Title is presented");
        softAssert.assertAll();
    }

    @Test
    public void checkDetailedTabIsOpened() {
        latesttransfer.openDetailedTab();
        softAssert.assertTrue(latesttransfer.transferDateLinkIsPresentedOnDetailedTab(), "transfer Date Link is presented");
        softAssert.assertTrue(latesttransfer.marketValueLinkIsPresentedOnDetailedTab(), "transfer Value Link is presented");
        softAssert.assertAll();
    }

    @Test
    public void orderTransfers() {
        latesttransfer.openDetailedTab();
        latesttransfer.viewFirstTransfer();
        latesttransfer.viewFirstTransfer();
        //WebElement firstTransferIntheYear = (WebElement) driver.findElements(By.xpath(".//*[text()=\"Jul 1, 2018\"]"));
        WebElement firstTransferIntheYear = driver.findElement(By.xpath(".//*[text()=\"Jul 1, 2018\"]"));
        softAssert.assertTrue(firstTransferIntheYear.isDisplayed(), "Jul 1, 2018 are presented");
        softAssert.assertAll();
    }
}
