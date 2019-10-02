package keyword;
import common.CommonAPI;
import keywordriven.KeywordUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestKeywordWM extends CommonAPI {

    @Test
    public void testKeyWord()throws Exception, InterruptedException, IOException {
        KeywordUtils keywordUtils = PageFactory.initElements(driver, KeywordUtils.class);
        keywordUtils.selectFeatures();
    }
}
