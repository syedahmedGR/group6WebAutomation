package page.objects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends CommonAPI {
    @FindBy(id = "email")
    WebElement homePageEmailWebElement;

    @FindBy(name = "pass")
    WebElement homePagePasswordWebElement;

    @FindBy(css = "input[type=submit]")   // customize css
     WebElement homePageLogInButttonWebElement;

    @FindBy(xpath = "//a[text()='Forgot account?']")
    WebElement homePageForgotAccountWebElement;

    @FindBy(linkText = "Sign Up")
     WebElement homePageSignupWebElement;

    public WebElement getFBHomePageEmailWebElement(){
        return homePageEmailWebElement;}
    public WebElement getFBHomePagePasswordWebElement(){
        return homePagePasswordWebElement;}
    public WebElement getFBHomePageLogInWebElement(){
        return homePageLogInButttonWebElement;}
    public WebElement getFBHomePageForgotAccountWebElement(){
        return homePageForgotAccountWebElement;}
    public WebElement getFBHomePageSignUpWebElement(){  //failed
        return homePageSignupWebElement;}

    public String getFBTitle(){
        return driver.getTitle();
    }

    public boolean isFBHomePageEmailDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFBHomePageEmailWebElement().isDisplayed();
    }

    public boolean isFBHomePagePasswordDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFBHomePagePasswordWebElement().isDisplayed();
    }

    public boolean isFBHomePageLogInDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFBHomePageLogInWebElement().isDisplayed();
    }

    public boolean isFBHomePageForgotAccountDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFBHomePageForgotAccountWebElement().isDisplayed();
    }

    public boolean isFBHomePageSignUpDisplayed(){    //failed
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFBHomePageSignUpWebElement().isDisplayed();
    }
}
