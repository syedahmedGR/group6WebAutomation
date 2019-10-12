package amazonItem;

import common.CommonAPI;
import menu.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAmazonSearch extends CommonAPI {

    @Test
    public void testSearch() throws Exception {

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButtonFromExcelFile();
    }
}
