package keywordriven;

import common.CommonAPI;
import home.HandlingCookies;
import home.SignInPage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import walmartsearch.SearchPage;

import java.io.IOException;

public class KeywordUtils extends CommonAPI {

    SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
    SearchPage searchPage = new SearchPage();
    HandlingCookies handlingCookies = PageFactory.initElements(driver, HandlingCookies.class);

    public void signInKeyWord(){
        handlingCookies.typeUserNamePassword();
    }
    /*public void signIn(WebDriver driver1)throws InterruptedException{
        logInPage.logInToPntForumWithoutPopup(driver1);
    }*/
    public void registration() {
        handlingCookies.clickHomePageAccountWebElement();
        handlingCookies.clickSignInWebElement();
        typeByCss("email", "smahmed1109@gmail.com");  //WMfrz1976
        typeByCss("password", "");
        handlingCookies.clickSubmitButton();
    }

    public void select(String featureName)throws Exception, IOException, InterruptedException{
        if ("signIn".equals(featureName)) {
            signInKeyWord();
        } else if ("registration".equals(featureName)) {
            registration();
        } else if ("search".equals(featureName)) {
            searchPage.searchInWalmartFromStaticList();
        } else if ("searchfromExcel".equals(featureName)) {
            searchPage.searchInWalmartFromExcel();
        } else {
            throw new InvalidArgumentException("Invalid features choice");
        }
    }
    // open msexcel -> new workbook -> save As -> select proj folder/data -> take option Excel 2004 .xls
    public void selectFeatures()throws Exception, IOException, InterruptedException{
        KeywordSearch itemsToBeSearched = new KeywordSearch();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i]);   // i=1 -> signIn, i=2-> Search, i=3->from excel
        }
    }
}
