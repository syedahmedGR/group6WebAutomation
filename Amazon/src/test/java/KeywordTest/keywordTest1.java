package KeywordTest;

import Keyword.Feature;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class keywordTest1 extends CommonAPI {
    @Test
    public void testKeyWord()throws InterruptedException, IOException {
        Feature features = PageFactory.initElements(driver, Feature.class);
        features.selectFeatures(driver);
    }
}

