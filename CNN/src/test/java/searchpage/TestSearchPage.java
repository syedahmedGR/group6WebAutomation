package searchpage;

import common.CommonAPI;

import homepage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPage extends CommonAPI {

    @Test
    public void search() throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        //searchPage.searchItemAndKeysEnter();
        searchPage.searchItemsAndSubmitButtonFromExcelFile();
        //searchPage.searchFor("sports");    //searchItemsAndSubmitButton();

    }
}
