package SearchPage;

import common.CommonAPI;
import main.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPage extends CommonAPI{

    SearchPage searchPage;
    @Test
    public void searchRandomItem() {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchRandomInput();
    }
    @Test
    public void searchRandomItemFromStaticList() {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemFromStaticList();
    }
    @Test
    public void searchRandomItemFromExcelFile() {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsFromExcelFile();
    }


}
