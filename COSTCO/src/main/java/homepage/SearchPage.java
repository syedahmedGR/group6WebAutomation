package homepage;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.testng.Assert;

public class SearchPage extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @FindBy(id = "search-field")
    public WebElement searchInputBox;

    @FindBy(xpath = "//*[@id=\"formcatsearch\"]/div[2]/button/i")
    public WebElement searchIcon;

    public WebElement getSearchInputBox(){
        return searchInputBox;
    }
    public WebElement getSearchIcon(){
        return getSearchIcon();
    }

    public void clickOnSearchInputBox(){
        getSearchInputBox().click();
    }
    public void searchFor(String value)throws Exception{
        getSearchInputBox().sendKeys(value, Keys.ENTER);
        sleepFor(2);
    }
    public void submitSearchIcon(){
        getSearchIcon().click();
    }
    public void clearInput(){
        searchInputBox.clear();
    }
    public void searchItemFromStaticList()throws Exception,IOException{
        List<String> list = DataSource.getItemValue();
        for (int i = 0; i < list.size(); i++) {
            clickOnSearchInputBox();
            searchFor(list.get(i));
            //submitSearchIcon();
            clearInput();
        }
    }
    public void searchItemFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = DataSource.getItemsListFromExcel();
        for (int i = 1; i < list.size(); i++) {
            clickOnSearchInputBox();
            searchFor(list.get(i));
            //submitSearchIcon();
            clearInput();
        }
    }
    public void searchItemWatch()throws Exception{
        getSearchInputBox().sendKeys("Watch", Keys.ENTER);
        sleepFor(7);
        Assert.assertTrue(getSearchInputBox().isDisplayed());
    }
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
//        List<String> itemList = DataSource.getItemValue();
//        for (String st : itemList) {
//            clickOnSearchButton();
//            searchFor(st);
//            submitSearchButton();
//            navigateBack();
//            clickOnSearchButton();
//            clearInput();
//            //validate items
//        }
    }
}
