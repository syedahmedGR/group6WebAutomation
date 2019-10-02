package fbhome;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    /*
    testcases:
    testcase1: verify title
    testcase2: Email textBox isDisplayed
    testcase3: Password textBox isDisplayed
    testcase4: forgot account isDisplayed
    testcase5: create Account isDisplayed
    testcase6: Facebook Logo isDisplayed
     */

    @FindBy(id = "email")
    WebElement homePageEmailWebElement;

    @FindBy(name = "pass")
    WebElement homePagePasswordWebElement;

    @FindBy(css = "input[type=submit]")   // customize css
            WebElement homePageLogInButttonWebElement;

    @FindBy(xpath = "//a[text()='Forgot account?']")
    WebElement homePageForgotAccountWebElement;

    @FindBy(name = "websubmit")         // xpath : //button[@type='submit'] or //button[text='Sig Up']
            WebElement homePageSignupWebElement;

    public WebElement getFBHomePageEmailWebElement(){ return homePageEmailWebElement;}
    public WebElement getFBHomePagePasswordWebElement(){ return homePagePasswordWebElement;}
    public WebElement getFBHomePageLogInWebElement(){ return homePageLogInButttonWebElement;}
    public WebElement getFBHomePageForgotAccountWebElement(){ return homePageForgotAccountWebElement;}
    public WebElement getFBHomePageSignUpWebElement(){ return homePageSignupWebElement;}

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

    public boolean isFBHomePageSignUpDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFBHomePageSignUpWebElement().isDisplayed();
    }
}
