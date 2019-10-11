package SignUp;

import common.CommonAPI;
import main.Signing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSignUp extends CommonAPI {

    Signing signing;

    @Test
    public void ClickSignUpPageButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.isSignUpOptionDisplayed();
    }
    @Test
    public void SignUpPageForMyself(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForMyself();
    }
    @Test
    public void SignUpPageForBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForBusiness();
    }
    @Test
    public void SignUpForMyselfInGoogleAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForMyself();
        signing.signUp_firstLastName();
        signing.signUp_createGmailAccount();
        signing.signUp_createPassword();
        signing.signUp_clickNextButton();
    }
    @Test
    public void SignUpForMyselfClickToCreateAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForMyself();
        signing.clickToExistingAccount();
    }
    @Test
    public void SignUpForMyselfByCreatingGoogleAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForMyself();
        signing.clickToExistingAccount();
        signing.signUp_firstLastName();
        signing.signUpCreateGmailAccount();
        signing.signUp_createPassword();
        signing.signUp_clickNextButton();
    }
    @Test
    public void cancelSignUp_forMyself(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForMyself();
        signing.signUp_cancelButton();
    }
    @Test
    public void SignUpForBusinessInGoogleAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForBusiness();
        signing.signUp_firstLastName();
        signing.signUp_createGmailAccount();
        signing.signUp_createPassword();
        signing.signUp_clickNextButton();
    }
    @Test
    public void SignUpForBusinessClickToCreateAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForBusiness();
        signing.clickToExistingAccount();
    }

    @Test
    public void SignUpForBusinessByCreatingGoogleAccount(){
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForBusiness();
        signing.clickToExistingAccount();
        signing.signUp_firstLastName();
        signing.signUpCreateGmailAccount();
        signing.signUp_createPassword();
        signing.signUp_clickNextButton();
    }
    @Test
    public void cancelSignUp_forBusiness(){
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickCreateAccountForBusiness();
        signing.signUp_cancelButton();
    }
}
