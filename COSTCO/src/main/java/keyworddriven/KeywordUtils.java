package keyworddriven;

import common.CommonAPI;
import homepage.SearchPage;
import homepage.SignIn;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import java.io.IOException;

public class KeywordUtils extends CommonAPI {
    SignIn signInPage = PageFactory.initElements(driver, SignIn.class);
    SearchPage searchPage = new SearchPage();

    public void signInKeyWord()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInPage.clickSignIn();
    }
    /*public void signIn(WebDriver driver1)throws InterruptedException{
    logInPage.logInToPntForumWithoutPopup(driver1);
    }*/
    public void select(String featureName)throws Exception, IOException, InterruptedException{
        if ("signIn".equals(featureName)) {
            signInKeyWord();
//        } else if ("search".equals(featureName)) {
//            searchPage.searchInWalmartFromStaticList();
//        } else if ("searchInHomePage".equals(featureName)) {
//            searchPage.searchInWalmartHomeFromStaticList();
//        } else if ("searchfromExcel".equals(featureName)) {
//            searchPage.searchInWalmartHomeFromExcel();
        }else {
            throw new InvalidArgumentException("Invalid features choice");
        }
    }
    // open msexcel -> new workbook -> save As -> select proj folder/data -> take option Excel 2004 .xls
    public void selectFeatures()throws Exception, IOException, InterruptedException{
        KeywordSearch itemsToBeSearched = new KeywordSearch();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i]); // i=1 -> signIn, i=2-> Search, i=3->from excel
        }
    }
}
