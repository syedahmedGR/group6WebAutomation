package walmartsearch;

import common.CommonAPI;
import home.HandlingCookies;
import keywordriven.GetWalmartSearchItems;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends CommonAPI {

    HandlingCookies handlingCookiesInSP = PageFactory.initElements(driver, HandlingCookies.class);
    GetWalmartSearchItems getWalmartSearchItems = PageFactory.initElements(driver, GetWalmartSearchItems.class);

    @FindBy(css = "input[id=global-search-input]")
    WebElement searchIconWebElement;

    public WebElement getSearchIconWebElement() {
        return searchIconWebElement;
    }
    public void searchInWalmartFromStaticList() throws InterruptedException {
        handlingCookiesInSP.typeUserNamePassword();
        getSearchIconWebElement().click();
        List<String> listWalmartSearchItem = getWalmartSearchItems.getItemValue();
        for(int i=0; i<listWalmartSearchItem.size(); i++){
            getSearchIconWebElement().sendKeys(listWalmartSearchItem.get(i), Keys.ENTER);
            Thread.sleep(5000);
            getSearchIconWebElement().clear();
        }
    }

    public void searchInWalmartFromExcel() throws Exception {
        handlingCookiesInSP.typeUserNamePassword();
        getSearchIconWebElement().click();
        List<String> listWalmartSearchItem = getWalmartSearchItems.getItemsListFromExcel();
        Thread.sleep(3000);
        for(int i=1; i<listWalmartSearchItem.size(); i++){
            getSearchIconWebElement().sendKeys(listWalmartSearchItem.get(i), Keys.ENTER);
            Thread.sleep(5000);
            System.out.println(listWalmartSearchItem.get(i) + " ");
            getSearchIconWebElement().clear();
        }
    }
}
