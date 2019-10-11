package main;

import common.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class AppButton extends CommonAPI {

    @FindBy(how = How.CSS, using = "#button [aria-label=\"YouTube apps\"]")
    WebElement youTubeAppsButton;
    @FindBy(css = "#contentWrapper > ytd-multi-page-menu-renderer")
    WebElement appSubMenu;
    @FindBy(css = "#button [aria-label=\"Create a video or post\"]")
    WebElement liveAndUpload;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer/a/paper-item")
    WebElement TV_app;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[2]/div[2]/ytd-compact-link-renderer[1]/a/paper-item/yt-formatted-string[1]")
    WebElement Music_app;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[2]/div[2]/ytd-compact-link-renderer[2]/a/paper-item")
    WebElement Kids_app;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[3]/div[2]/ytd-compact-link-renderer[1]/a/paper-item/yt-formatted-string[1]")
    WebElement creat_academ;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[3]/div[2]/ytd-compact-link-renderer[2]/a/paper-item/yt-formatted-string[1]")
    WebElement youTubeArtist;
    @FindBy(css = "#sections > yt-multi-page-menu-section-renderer")
    WebElement uploadLiveButton;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer/div[2]/ytd-compact-link-renderer[1]/a/paper-item/yt-formatted-string[1]")
    WebElement uploadStream;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer/div[2]/ytd-compact-link-renderer[2]/a/paper-item/yt-formatted-string[1]")
    WebElement liveStream;
    @FindBy(css = "#headingText > span")
    WebElement SignIn;
    @FindBy(css = "#button [aria-label=\"Settings\"]")
    WebElement settingButton;
    @FindBy(css = "#sections.style-scope.ytd-multi-page-menu-renderer")
    WebElement settingMenu;
    @FindBy(css = "input[type=\"email\"]")
    WebElement inputEmail;
    @FindBy(css = "#items > ytd-toggle-theme-compact-link-renderer")
    WebElement youTubeTheme;
    @FindBy(css = "#submenu > .style-scope.ytd-multi-page-menu-renderer")
    WebElement themeSubMenu;
    @FindBy(css = "#caption-container > paper-toggle-button > div.toggle-container.style-scope.paper-toggle-button")
    WebElement switchTheme;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[1]/a/paper-item")
    WebElement settingSubMenu;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[2]/a/paper-item")
    WebElement dataYouTubeSubMenu;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[3]/a/paper-item")
    WebElement helpSubMenu;
    @FindBy(id = "google-feedback-wizard")
    WebElement helpDialog;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[4]/a/paper-item")
    WebElement sendFeedback;
    @FindBy(id = "google-feedback-wizard")
    WebElement feedbackDisplayed;
    @FindBy(xpath = "/html/body/ytd-app/ytd-popup-container/iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[5]/a/paper-item")
    WebElement shortCutKey;
    @FindBy(id = "page-manager")
    WebElement displayShortCut;

    public WebElement getYouTubeAppsButton(){ return youTubeAppsButton; }
    public WebElement getAppSubMenu(){ return appSubMenu; }
    public WebElement getLiveAndUpload(){ return liveAndUpload; }
    public WebElement getTV_app(){ return TV_app; }
    public WebElement getMusic_app(){ return Music_app; }
    public WebElement getKids_app(){ return Kids_app; }
    public WebElement getCreat_academ(){ return creat_academ; }
    public WebElement getYouTubeArtist(){ return youTubeArtist; }
    public WebElement getUploadLiveButton(){ return uploadLiveButton; }
    public WebElement getUploadStream(){ return uploadStream; }
    public WebElement getLiveStream(){ return liveStream; }
    public WebElement getSignIn(){ return SignIn; }
    public WebElement getAdjustSettingButton(){ return settingButton; }
    public WebElement getSettingMenu(){ return settingMenu; }
    public WebElement getInputEmail(){ return inputEmail; }
    public WebElement getYouTubeTheme(){ return youTubeTheme; }
    public WebElement getThemeSubMenu(){ return themeSubMenu; }
    public WebElement getSwitchTheme(){ return switchTheme; }
    public WebElement getSettingSubMenu(){ return settingSubMenu; }
    public WebElement getDataYouTubeSubMenu(){ return dataYouTubeSubMenu; }
    public WebElement getHelpSubMenu(){ return helpSubMenu; }
    public WebElement getHelpDialog(){ return helpDialog; }
    public WebElement getSendFeedback(){ return sendFeedback; }
    public WebElement getFeedbackDisplayed(){ return feedbackDisplayed; }
    public WebElement getShortCutKey(){ return shortCutKey; }
    public WebElement getDisplayShortCut(){ return displayShortCut; }

    public boolean isSignInPageDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getSignIn().isDisplayed();
    }
    public boolean isSettingMenuDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getSettingMenu().isDisplayed();
    }

    public void clickOnAppButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getYouTubeAppsButton().click();
    }

    public void verifyAppSubMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getAppSubMenu().isDisplayed());
    }

    public void clickTVUnderApp(){
        getTV_app().click();
        handleNewTab(driver);
    }

    public void verifyTVWebPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals("YouTube TV - Watch & DVR Live Sports, Shows & News", driver.getTitle());
    }

    public void clickMusicUnderApp(){
        getMusic_app().click();
        handleNewTab(driver);
    }

    public void verifyMusicWebPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals("YouTube Music", driver.getTitle());
    }

    public void clickKidsUnderApp(){
        getKids_app().click();
        handleNewTab(driver);
    }

    public void verifyKidsWebPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals("YouTube Kids - An App Made Just For Kids", driver.getTitle());
    }

    public void clickAcademyUnderApp(){
        getCreat_academ().click();
        handleNewTab(driver);
    }

    public void verifyAcademyWebPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            Thread.sleep(25000);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Creator Academy - YouTube", driver.getTitle());
    }

    public void clickArtistUnderApp(){
        getYouTubeArtist().click();
        handleNewTab(driver);
    }

    public void verifyArtistWebPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String expect = driver.getTitle();
        Assert.assertEquals("YouTube for Artists", expect);
    }

    public void clickOnLiveAndUploadButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLiveAndUpload().click();
    }

    public void verifyUploadLiveSubMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getUploadLiveButton().isDisplayed());
    }

    public void clickUpload_underLiveAndUpload(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUploadStream().click();
    }

    public void confirmUpload(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(isSignInPageDisplayed());
    }

    public void confirmLive(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(isSignInPageDisplayed());
    }

    public void clickLiveUnderLiveAndUpload(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLiveStream().click();
    }

    public void signInUserUpload(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Signing signing = PageFactory.initElements(driver, Signing.class);
        try{
            signing.fillInUser();
            signing.fillInPass();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("https://www.youtube.com/upload", driver.getCurrentUrl());
    }

    public void signInUserLive(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Signing signing = PageFactory.initElements(driver, Signing.class);
        try{
            signing.fillInUser();
            signing.fillInPass();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Account verification - YouTube", driver.getTitle());
    }

    public void getSettingButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAdjustSettingButton().click();
    }

    public void confirmSetting(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(isSettingMenuDisplayed());
    }

    public void clickSettingTheme(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getYouTubeTheme().click();
        getSwitchTheme().click();
        Assert.assertTrue(getThemeSubMenu().isDisplayed());
    }

    public void clickSettingIconNotSignedIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSettingSubMenu().click();
        Assert.assertTrue(getInputEmail().isDisplayed());
    }

    public void clickSettingIconSignInUser(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSettingSubMenu().click();
        Signing signing = PageFactory.initElements(driver, Signing.class);
        signing.fillInUser();
        signing.fillInPass();
        signing.isYouTubeSearchBoxDisplayed();
    }

    public void clickYoutubeDataNotSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDataYouTubeSubMenu().click();
        Assert.assertEquals("Sign in - Google Accounts", driver.getTitle());
    }

    public void clickYoutubeDataSignedInUser(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDataYouTubeSubMenu().click();
        Signing signing = PageFactory.initElements(driver, Signing.class);
        try {
            signing.fillInUser();
            signing.fillInPass();
            sleepFor(7);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Your data in YouTube", driver.getTitle());
    }

    public void clickHelp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            getHelpSubMenu().click();
            sleepFor(16);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(getHelpDialog().isEnabled());
    }

    public void clickAndSendFeedback(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSendFeedback().click();
        Assert.assertTrue(getFeedbackDisplayed().isDisplayed());
    }

    public void clickShortCutKeyDisplay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShortCutKey().click();
        Assert.assertTrue(getDisplayShortCut().isDisplayed());
    }
}
