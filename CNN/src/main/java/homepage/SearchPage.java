package homepage;


import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy(how = How.CLASS_NAME, using ="search-icon")
    WebElement searchIconWebElement;

    @FindBy(id = "header-search-bar")             //(how = How.XPATH, using ="//input[@class='cnn-search__input']")
    WebElement searchInputWebElement;

    @FindBy(xpath = "//input[@class='cnn-search__input']")             //(how = How.XPATH, using ="//input[@class='cnn-search__input']
    WebElement searchNewInputWebElement;

    public WebElement getSearchIconWebElement(){return searchIconWebElement;}
    public WebElement getSearchInputWebElement(){return searchInputWebElement;}
    public WebElement getSearchNewInputWebElement(){return searchNewInputWebElement;}

    public void searchItemAndKeysEnter() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = ReadDataFromExternalSource.getItemValue();
        getSearchIconWebElement().click();
        getSearchInputWebElement().sendKeys(list.get(0), Keys.ENTER);
        for(int i=1; i<list.size(); i++) {
            getSearchNewInputWebElement().sendKeys(list.get(i), Keys.ENTER);
            //getSearchNewInputWebElement().click();
            Thread.sleep(5000);
            getSearchNewInputWebElement().clear();
            //getSearchNewInputWebElement().sendKeys("sports", Keys.ENTER);
        }

    }

    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException  {
        //Read data from Excel file using Apache POI
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = ReadDataFromExternalSource.getItemsListFromExcel();
        getSearchIconWebElement().click();
        getSearchInputWebElement().sendKeys(list.get(1), Keys.ENTER);
        getSearchNewInputWebElement().clear();
        for(int i=2; i<list.size(); i++) {
            getSearchNewInputWebElement().sendKeys(list.get(i), Keys.ENTER);
            //getSearchNewInputWebElement().click();
            Thread.sleep(3000);
            getSearchNewInputWebElement().clear();
        }
    }

}
