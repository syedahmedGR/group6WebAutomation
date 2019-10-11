package appButton;

import common.CommonAPI;
import main.AppButton;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAppButton extends CommonAPI {

    public AppButton appButton;

    @Test
    public void testAppButtonSubMenu() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnAppButton();
        appButton.verifyAppSubMenu();
    }
    @Test
    public void testYoutubeTVApp() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnAppButton();
        appButton.clickTVUnderApp();
        appButton.verifyTVWebPage(driver);
    }
    @Test
    public void testYoutubeMusicApp() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnAppButton();
        appButton.clickMusicUnderApp();
        appButton.verifyMusicWebPage(driver);
    }
    @Test
    public void testYoutubeKidsApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnAppButton();
        appButton.clickKidsUnderApp();
        appButton.verifyKidsWebPage(driver);
    }
    @Test
    public void testYoutubeCreateAcademyApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnAppButton();
        appButton.clickAcademyUnderApp();
        appButton.verifyAcademyWebPage(driver);
    }
    @Test
    public void testYoutubeArtistApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnAppButton();
        appButton.clickArtistUnderApp();
        appButton.verifyArtistWebPage(driver);
    }

    @Test
    public void testUploadAndLiveButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnLiveAndUploadButton();
        appButton.verifyUploadLiveSubMenu();
    }
    @Test
    public void testUploadNotSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnLiveAndUploadButton();
        appButton.clickUpload_underLiveAndUpload();
        appButton.confirmUpload();
    }
    @Test
    public void testUploadSignedIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnLiveAndUploadButton();
        appButton.clickUpload_underLiveAndUpload();
        appButton.confirmUpload();
        appButton.signInUserUpload();
    }
    @Test
    public void testLiveNotSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnLiveAndUploadButton();
        appButton.clickLiveUnderLiveAndUpload();
        appButton.confirmLive();
    }
    @Test
    public void testLiveSignedIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.clickOnLiveAndUploadButton();
        appButton.clickLiveUnderLiveAndUpload();
        appButton.confirmLive();
        appButton.signInUserLive();
    }
    @Test
    public void testSetting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.confirmSetting();
    }
    @Test
    public void testThemeSetting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickSettingTheme();
    }
    @Test
    public void testSettingNotSignedIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickSettingIconNotSignedIn();
    }
    @Test
    public void testSettingSignInUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickSettingIconSignInUser();
    }
    @Test
    public void testYoutubeDataNotSignedIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickYoutubeDataNotSignIn();
    }
    @Test
    public void testYoutubeDataSignInUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickYoutubeDataSignedInUser();
    }
    @Test
    public void testOnHelpEnabled() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickHelp();
    }
    @Test
    public void testOnFeedbackEnabled() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickAndSendFeedback();
    }
    @Test
    public void testOnShortCuts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appButton = PageFactory.initElements(driver, AppButton.class);
        appButton.getSettingButton();
        appButton.clickShortCutKeyDisplay();
    }

}
