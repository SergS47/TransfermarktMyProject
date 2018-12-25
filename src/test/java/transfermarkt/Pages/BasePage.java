package transfermarkt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by сергей on 10.12.2018.
 */
public class BasePage extends AbstractPage {

    public BasePage (WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = ".//*[@id='login']/a/span[2]")
    private static WebElement logInLink;

    @FindBy(xpath = ".//*[@id='LoginForm_username']")
    private static WebElement usernameField;

    @FindBy(xpath = ".//*[@id='LoginForm_password']")
    private static WebElement passwordField;

    @FindBy(xpath = ".//*[@id='loginButton']")
    private static WebElement logInButtonInForm;

    @FindBy(xpath = ".//*[@id='userprofil-box']")
    private static WebElement userprofilBox;

    @FindBy(xpath = ".//*[@id='profil-link']")
    private static WebElement profileLink;

    @FindBy(xpath = ".//*[@id='profilbox']/a[3]")
    private static WebElement logOutLink;

    @FindBy (xpath=".//*[@id='ajax-status']/p[text()='- Invalid username or password.']")
    private static WebElement errorUserName;

    public void openLoginForm(){
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("LOG IN")));
        logInLink.click();
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        wait.until(ExpectedConditions.visibilityOf(passwordField));
    }

    public void enterUsername(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
   }
    public void clickOnLoginButton(){
        logInButtonInForm.click();
        wait.until(ExpectedConditions.visibilityOf(userprofilBox));
    }

    public boolean userProfileBoxIsDisplayed(){
        return userprofilBox.isDisplayed();
    }

    public void openLogoutForm(){
        profileLink.click();
        logOutLink.isDisplayed();
    }

    public void logOutFromUserProfile(){
        logOutLink.click();
        wait.until(ExpectedConditions.visibilityOf(logInLink));
    }

    public boolean logInButtonIsDisplayed(){
        return logInLink.isDisplayed();
    }

    public boolean incorrectUserNameErrorIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(errorUserName));
        return errorUserName.isDisplayed();
    }

}
