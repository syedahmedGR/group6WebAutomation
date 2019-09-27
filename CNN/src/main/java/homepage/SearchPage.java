package homepage;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy(how = How.CLASS_NAME, using ="search-icon")            //(how = How.XPATH, using ="//input[@class='cnn-search__input']")
    WebElement searchInputWebElement;

    @FindBy(how = How.ID, using = "header-search-bar")            ////button[@class='cnn-search__button icon icon--search']")   //(how = How.XPATH, using ="//button[@class='cnn-search__button icon icon--search']")
    WebElement submitButtonWebElement;

    /*@FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;*/

    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public void clickSearchIcon(){ searchInputWebElement.click();}
    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = ReadDataFromExternalSource.getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

    public void searchItemsAndSubmitButton(WebDriver driver1)throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = ReadDataFromExternalSource.getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException  {
        // ToDo
        //Read data from Excel file using Apache POI
        List<String> list = null;
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> itemList = ReadDataFromExternalSource.getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
            //validate items
        }
    }
}
