package transfermarkt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



/**
 * Created by сергей on 10.12.2018.
 */
public class SearchPage extends AbstractPage {

    @FindBy(xpath = ".//*[@id='schnellsuche']/input[1]")
     private static WebElement searchFieldInHeader;

    @FindBy(xpath = ".//*[@id='schnellsuche']/input[2]")
    private static WebElement searchButtonHeader;

    public SearchPage (WebDriver driver){
        super(driver);
    }

    public void mainSerach(String searchText) {
        searchFieldInHeader.clear();
        searchFieldInHeader.sendKeys(searchText);
        searchButtonHeader.click();
    }
}
