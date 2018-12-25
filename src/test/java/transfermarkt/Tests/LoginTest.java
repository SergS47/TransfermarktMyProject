package transfermarkt.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import transfermarkt.Pages.BasePage;

/**
 * Created by сергей on 10.12.2018.
 */
public class LoginTest extends BaseTest {
    BasePage basepage = new BasePage(getDriver());
    public static final String MAINPAGE = "https://www.transfermarkt.com";

    @BeforeTest
    public void openMain(){
        BaseTest.initDriver(MAINPAGE);
    }

    @Test(priority = 1)
    public void loginToMyAccount(){
        basepage.openLoginForm();
        basepage.enterUsername("AutomationUser");
        basepage.enterPassword("Password123!");
        basepage.clickOnLoginButton();
        softAssert.assertTrue(basepage.userProfileBoxIsDisplayed(),"Profile Box Is Displayed");
        softAssert.assertAll();
    }

    //@Test(dependsOnMethods = "loginToMyAccount", alwaysRun = true)
    @Test(priority = 2)
    public void logoutFromMyAccount(){
        basepage.openLogoutForm();
        basepage.logOutFromUserProfile();
        softAssert.assertTrue(basepage.logInButtonIsDisplayed(),"User is logged out");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void errorIsShownIfIncorrectUserName(){
        basepage.openLoginForm();
        basepage.enterUsername("incorrectName");
        basepage.enterPassword("Password123!");
        basepage.clickOnLoginButton();
        softAssert.assertTrue(basepage.incorrectUserNameErrorIsDisplayed(),"Error Is Displayed");
        softAssert.assertAll();
    }

}
