package keyword;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmartsearch.SearchPage;

public class TestWalmartSearch extends CommonAPI {

    // DataSource -> list
    /*
       1. Walmart HomePage -> profile page
       2. getEmailWebElement.sendkeys(list.get(i))
       3. getPasswordWebElement.sendkeys(list.get(i))
       4. getLogInWebElement.click -> profile page
       5. getSearchBarWebElement.click
     */

    SearchPage searchPage;

    @BeforeMethod
    public void initializeWalmartTestSearchPage(){
        this.searchPage= PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void testWalmartSearchStaticListInput() throws Exception  {
        searchPage.searchInWalmartFromStaticList();
    }

    @Test
    public void testWalmartSearchFromExcel() throws Exception {
        searchPage.searchInWalmartFromExcel();
    }
}
