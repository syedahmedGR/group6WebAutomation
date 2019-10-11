package main;

import common.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import utility.DataSource;


public class KeyWord extends CommonAPI {

    private WebDriver driver;
    private Signing signing;
    private SearchPage searchPage;
    private SidebarMenu sidebarMenu;

    public KeyWord(WebDriver driver){
        this.driver = driver;
        signing = PageFactory.initElements(this.driver, Signing.class);
        searchPage = PageFactory.initElements(this.driver, SearchPage.class);
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
    }

    public void selectFeatures(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try {
            String [] steps = DataSource.getFeaturesListFromExcel();
            for(int execute=0; execute<steps.length; execute++)
                selectStep(steps[execute]);

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void selectStep(String input){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        if(input.equalsIgnoreCase("FEATURES")) return;
        else if(input.equalsIgnoreCase("signIn")) signInSelected();
        else if(input.equalsIgnoreCase("clickTrending")) trendingSelected();
        else if(input.equalsIgnoreCase("clickSubscriptions")) subscriptionSelected();
        else if(input.equalsIgnoreCase("clickLibrary")) librarySelected();
        else if(input.equalsIgnoreCase("clickHistory")) historySelected();
        else if(input.equalsIgnoreCase("clickSubscriptionSignIn")) signInSubscriptionButton();
        else if(input.equalsIgnoreCase("clickLibrarySignIn")) signInLibraryButton();
        else if(input.equalsIgnoreCase("clickHistorySignIn")) signInHistoryButton();
        else if(input.contains("searchFor")) searchElement(input);
        else if(input.equalsIgnoreCase("signOut")) signOutSelected();
        else throw new InvalidArgumentException("Invalid: Unknown Feature");
    }

    public void signInSelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(7);
            signing.clickOnSignInButton();
            sleepFor(7);
            signing.fillInUser();
            sleepFor(7);
            signing.fillInPass();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void signOutSelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{

        } catch (Exception ex){
            ex.printStackTrace();
        }
        signing.clickGoogleIcon();
        signing.clickToSignOut();
    }

    public void trendingSelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sidebarMenu.gotoTrending();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void signInSubscriptionButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sidebarMenu.clickSubscriptionSignIn();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void subscriptionSelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sidebarMenu.gotoSubscription();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void signInLibraryButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sidebarMenu.clickLibrarySignIn();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void librarySelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sidebarMenu.gotoLibrary();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void signInHistoryButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sidebarMenu.clickHistorySignIn();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void historySelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sidebarMenu.gotoHistory();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void searchElement(String input){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            searchPage.searchInputFromKeyDriven(input);
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
