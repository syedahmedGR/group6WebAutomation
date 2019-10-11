package SignIn;

import common.CommonAPI;
import main.Signing;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSignIn extends CommonAPI {

    public Signing signing;

    @Test
    public void VerifySignInButtonDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.isSignInButtonDisplayed();
    }
    @Test
    public void ClickToSignInPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.isHeadingText_onSignInPage_displayed();
    }
    @Test
    public void SignInUserPass(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.isInputPasswordDisplayed();
    }
    @Test
    public void SignInSuccess(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.fillInPass();
        signing.isYouTubeSearchBoxDisplayed();
    }
    @Test
    public void SignInAndShowPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.fillInPass();
        signing.clickOnShowPassword();
    }
    @Test
    public void SignInFailedByInvalidUsername(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser_Invalid();
        signing.isInvalidSignInDisplayed();
    }
    @Test
    public void SignInFailedByInvalidPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.fillInPass_Invalid();
        signing.isInvalidPassInDisplayed();
    }
    @Test
    public void VerifyForgotEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.clickOnForgot_Email_andVerifyPage();
    }
    @Test
    public void ResetForgotPasswordByPreviousPassInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.clickForgotPasswordAndVerifyPage();
    }
    @Test
    public void ResetForgotPasswordByText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.clickForgotPassword();
        signing.resetPasswordByText();
    }
    @Test
    public void ResetForgotPasswordViaAltEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.clickForgotPassword();
        signing.resetPasswordByViaAltEmail();
    }
    @Test
    public void ResetForgotPasswordByInfoOnDateCreated(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.clickForgotPassword();
        signing.resetPasswordByDateCreated();
    }
    @Test
    public void ResetForgotPasswordByContactAdmin(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.clickForgotPassword();
        signing.resetPasswordByContactAdmin();
    }
    @Test
    public void ResetForgotPasswordFailed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signing = PageFactory.initElements(driver, Signing.class);
        signing.clickOnSignInButton();
        signing.fillInUser();
        signing.clickForgotPassword();
        signing.resetPasswordUnsure();
    }

}
