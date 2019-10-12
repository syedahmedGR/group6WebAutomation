package Keyword;

import KeywordDriven.LogIn;
import common.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Feature extends CommonAPI {
    LogIn logInPage = PageFactory.initElements(driver, LogIn.class);
    @Test
    public void SignIn() throws Exception {
        logInPage.createAccount();
    }
    public void signIn(WebDriver driver1) {

    }
    public void search(WebDriver driver1) {
    }
    public void registration() {
    }
    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "signIn":
                signIn(driver1);
                break;
            case "registration":
                registration();
                break;
            case "search":
                search(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
