package home;

import common.CommonAPI;
import keyworddriven.KeywordSearch;
import keyworddriven.KeywordUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestKeywordUtils extends CommonAPI {

    @Test
    public void verifySelectFeatures()throws Exception{
        KeywordUtils keywordUtils = PageFactory.initElements(driver,KeywordUtils.class);
        keywordUtils.selectFeatures();
    }
}
