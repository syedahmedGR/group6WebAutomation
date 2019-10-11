package keyWordDriven;

import common.CommonAPI;
import main.KeyWord;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestKeyWord extends CommonAPI{

    KeyWord keyWord;

    @Test
    public void testKeyWordFromExcel(){
        keyWord = new KeyWord(this.driver);
        keyWord.selectFeatures();
    }
}
