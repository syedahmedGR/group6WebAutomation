package home;

import common.CommonAPI;
import homepage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {
    SearchPage searchPage;
    @BeforeMethod
    public void initSearch()throws Exception{
       searchPage = PageFactory.initElements(driver,SearchPage.class);
    }
    @Test
    public void verifySearchItemFromStaticList()throws Exception{
        searchPage.searchItemFromStaticList();
    }
    @Test
    public void verifySearchItemFromExcel()throws Exception{
        searchPage.searchItemFromExcel();
    }
    @Test
    public void verifySearchItemWatch()throws Exception{
        searchPage.searchItemWatch();
    }
}
