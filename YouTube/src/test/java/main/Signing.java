package main;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class Signing extends CommonAPI {

    @FindBy(css = "#text.style-scope.ytd-button-renderer.style-suggestive.size-small")
    WebElement signInButton;
    @FindBy(css = "#headingText > span")
    WebElement signInLabel;
    @FindBy(css = "#headingText")
    WebElement headingText;
    @FindBy(css = "input[type=\"email\"]")
    WebElement inputUserElement;
    @FindBy(css = "#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    WebElement inputPassElement;
    @FindBy(id = "search")
    WebElement youTubeSearchBox;
    @FindBy(css = "#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div.cDSmF > div > div.LXRPh > div.dEOOab.RxsGPe > div")
    WebElement inValidSignInLabel;
    @FindBy(css = "#password > div.aCsJod.oJeWuf > div > span > div > span > span")
    WebElement showPass;
    @FindBy(css = "#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div:nth-child(3) > button")
    WebElement forgotEmail;
    @FindBy(css = "#forgotPassword > span > span")
    WebElement forgotPasswordBtn;
    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement inputUserForForgotPassword;
    @FindBy(css = "div > div.daaWTb > div")
    WebElement tryAnotherway;
    @FindBy(css = "#smsButton > div.ZFr60d.CeoRYc")
    WebElement texting;
    @FindBy(id = "idvpreregisteredemailNext")
    WebElement sendToAltEmail;
    @FindBy(id = "year")
    WebElement yearAccountCreated;
    @FindBy(css = "div > div.Xb9hP > input")
    WebElement contactAdmin;
    @FindBy(css = "#initialView > div.xkfVF")
    WebElement accountUnsure;
    @FindBy(css = "div.U26fgb.c7fp5b.FS4hgd.FliLIb.uRo0Xe.t29vte[role=\"button\"]")
    WebElement signUp;
    @FindBy(css = "div.JPdR6b.ILYVD.qjTEB")
    WebElement optionSignUp;
    @FindBy(css = ".z80M1.G3hhxb[aria-label=\"For myself\"]")
    WebElement createAccount_forMyself;
    @FindBy(css = ".z80M1.G3hhxb[aria-label=\"To manage my business\"]")
    WebElement createAccount_toManageBusiness;
    @FindBy(css = "#firstName")
    WebElement signUp_firstName;
    @FindBy(css = "#lastName")
    WebElement signUp_lastName;
    @FindBy(css = "#username")
    WebElement signUp_username;
    @FindBy(css = "#view_container > form > div.mbekbe.bxPAYd > div > div.RCum0c > div.rsFRt > button")
    WebElement existingAccount;
    @FindBy(css = "#headingSubtext > span")
    WebElement forgotEmailLabel;
    @FindBy(id = "avatar-btn")
    WebElement googleAccountIcon;
    @FindBy(xpath = "//yt-multi-page-menu-section-renderer[1]//div[2]//ytd-compact-link-renderer[5]//a[1]//paper-item[1]")
    WebElement signOut;
    @FindBy(css = "button[class=\"uBOgn\"]")
    WebElement signUp_createGmailAccount;
    @FindBy(css = "#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    WebElement signUp_password;
    @FindBy(css = "#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    WebElement signUp_confirmPassword;
    @FindBy(id = "accountDetailsNext")
    WebElement signUp_clickNextButton;
    @FindBy(css = "#phoneNumberId")
    WebElement signUp_phoneNumber;
    @FindBy(css = "#view_container > form > div.mbekbe.bxPAYd > div > div.GtglAe > div.AIu8h > div")
    WebElement signUp_cancelButton;

    private String email = "gaming4440@gmail.com";
    private String password = "Novac6682";

    private String invalidEmail = "gmail@gmail.com";
    private String invalid_Pass = "0.0.0.0";

    private String fname = "Asif", lname = "Roni", useEmail = "asifroni673@gmail.com";
    private String create_email = "testingTheSelenium.2019.PNT@gmail.com";
    private String create_password = "selenium2019#abcdef123456";
    private String generate_gmail = "aronipnt2019@gmail.com";

    public WebElement getSignInButton(){ return signInButton; }
    public WebElement getForgotEmail(){ return forgotEmail; }
    public WebElement getInputUserElement(){ return inputUserElement; }
    public WebElement getInputPassElement(){ return inputPassElement; }
    public WebElement getShowPass(){ return showPass; }
    public WebElement getSignInLabel(){ return signInLabel; }
    public WebElement getHeadingText(){ return headingText; }
    public WebElement getYouTubeSearchBox(){ return youTubeSearchBox; }
    public WebElement getInValidSignInLabel(){ return inValidSignInLabel; }
    public WebElement getInputUserForForgotPassword(){ return inputUserForForgotPassword; }
    public WebElement getForgotPasswordBtn(){ return forgotPasswordBtn; }
    public WebElement getTryAnotherway(){ return tryAnotherway; }
    public WebElement getTexting(){ return texting; }
    public WebElement getSendToAltEmail(){ return sendToAltEmail; }
    public WebElement getYearAccountCreated(){ return yearAccountCreated; }
    public WebElement getContactAdmin(){ return contactAdmin; }
    public WebElement getAccountUnsure(){ return accountUnsure; }
    public WebElement getSignUp(){ return signUp; }
    public WebElement getOptionSignUp(){ return optionSignUp; }
    public WebElement getCreateAccount_forMyself(){ return createAccount_forMyself; }
    public WebElement getCreateAccount_toManageBusiness(){ return createAccount_toManageBusiness; }
    public WebElement getExistingAccount(){ return existingAccount; }
    public WebElement getForgotEmailLabel(){ return forgotEmailLabel; }
    public WebElement getSignUp_firstName(){ return signUp_firstName; }
    public WebElement getSignUp_lastName(){ return signUp_lastName; }
    public WebElement getSignUp_username(){ return signUp_username; }
    public WebElement getGoogleAccountIcon(){ return googleAccountIcon; }
    public WebElement getSignOut(){ return signOut; }
    public WebElement getSignUp_createGmailAccount(){ return signUp_createGmailAccount; }
    public WebElement getSignUp_password(){ return signUp_password; }
    public WebElement getSignUp_confirmPassword(){ return signUp_confirmPassword; }
    public WebElement getSignUp_clickNextButton(){ return signUp_clickNextButton; }
    public WebElement getSignUp_phoneNumber(){ return signUp_phoneNumber; }
    public WebElement getSignUp_cancelButton(){ return signUp_cancelButton; }

    public void clickOnSignInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignInButton().click();
    }

    public void clickGoogleIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getGoogleAccountIcon().click();
    }

    public void clickToSignOut(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignOut().click();
    }

    public void isHeadingText_onSignInPage_displayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getHeadingText().isDisplayed());
    }

    public void fillInUser(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInputUserElement().sendKeys(email, Keys.ENTER);
    }

    public void isInputPasswordDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertTrue(getInputPassElement().isDisplayed());
    }

    public void fillInPass(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInputPassElement().sendKeys(password, Keys.ENTER);
    }

    public void isYouTubeSearchBoxDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getYouTubeSearchBox().isDisplayed());
    }

    public void clickOnShowPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShowPass().click();
        Assert.assertTrue(getShowPass().isDisplayed());
    }

    public void fillInUser_Invalid(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInputUserElement().click();
        getInputUserElement().sendKeys(invalidEmail, Keys.ENTER);
    }

    public void isInvalidSignInDisplayed(){
        Assert.assertTrue(getInValidSignInLabel().isDisplayed());
    }

    public void fillInPass_Invalid(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInputPassElement().sendKeys(invalid_Pass, Keys.ENTER);
        Assert.assertTrue(getInputPassElement().isDisplayed());
    }

    public void isInvalidPassInDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getInputPassElement().isDisplayed());
    }
//    public void isSignInLabelDisplayed(){
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        Assert.assertTrue(getSignInLabel().isDisplayed());
//    }
    public void clickOnForgot_Email_andVerifyPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getForgotEmail().click();
        Assert.assertTrue(getForgotEmailLabel().isDisplayed());
    }

    public void clickForgotPasswordAndVerifyPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        getForgotPasswordBtn().click();
        Assert.assertTrue(getInputUserForForgotPassword().isDisplayed());
    }

    public void clickForgotPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        getForgotPasswordBtn().click();
    }

    public void resetPasswordByText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertTrue(getTexting().isDisplayed());
    }

    public void resetPasswordByViaAltEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertTrue(getSendToAltEmail().isDisplayed());
    }

    public void resetPasswordByDateCreated(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertTrue(getYearAccountCreated().isDisplayed());
    }

    public void resetPasswordByContactAdmin(){
        try {
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertTrue(getContactAdmin().isDisplayed());
    }

    public void resetPasswordUnsure(){
        try {
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
            getTryAnotherway().click();
            sleepFor(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertTrue(getAccountUnsure().isDisplayed());
    }

    public void isSignUpOptionDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        try {
            sleepFor(5);
            getSignUp().click();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertTrue(getOptionSignUp().isDisplayed());
    }

    public void clickCreateAccountForMyself() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            getSignUp().click();
            sleepFor(7);
            getCreateAccount_forMyself().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Create your Google Account", driver.getTitle());
    }

    public void clickCreateAccountForBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            getSignUp().click();
            sleepFor(7);
            getCreateAccount_toManageBusiness().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Create your Google Account", driver.getTitle());
    }

    public void signUp_firstLastName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignUp_firstName().sendKeys(fname, Keys.TAB);
        getSignUp_lastName().sendKeys(lname, Keys.TAB);
    }

    public void clickToExistingAccount(){
        try {
            sleepFor(5);
            getExistingAccount().click();
            sleepFor(5);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void signUpCreateGmailAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignUp_username().sendKeys(generate_gmail);
        getSignUp_password().click();
    }

    public void signUp_createGmailAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignUp_createGmailAccount().click();
        getSignUp_username().sendKeys(create_email);
        getSignUp_password().click();
    }

    public void signUp_createPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignUp_password().sendKeys(create_password, Keys.TAB);
        getSignUp_confirmPassword().sendKeys(create_password);
    }

    public void signUp_clickNextButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try {
            getSignUp_clickNextButton().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(getSignUp_phoneNumber().isDisplayed());
    }


    public void signUp_cancelButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignUp_cancelButton().click();
        Assert.assertTrue(getSignInLabel().isDisplayed());
    }

    public void isSignInButtonDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getSignInButton().isDisplayed());
    }

}
