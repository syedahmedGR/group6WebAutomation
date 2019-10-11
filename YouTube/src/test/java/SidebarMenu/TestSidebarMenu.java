package SidebarMenu;

import common.CommonAPI;
import main.SidebarMenu;
import main.Signing;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSidebarMenu extends CommonAPI {

    public SidebarMenu sidebarMenu;

    @Test
    public void clickOptionSideBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
    }
    @Test
    public void goClickHomeIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoHomeIcon();
        sidebarMenu.verifyHomePage(this.driver);
    }
    @Test
    public void goClickTrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoTrending();
        sidebarMenu.verifyTrendingPage(this.driver);
    }
    @Test
    public void goClick_Music_UnderTrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoTrending();
        sidebarMenu.clickMusicUnderTrending();
    }
    @Test
    public void goClickGamingUnderTrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoTrending();
        sidebarMenu.clickGamingUnderTrending();
    }
    @Test
    public void goClickNewsUnderTrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoTrending();
        sidebarMenu.clickNewsUnderTrending();
    }
    @Test
    public void goClickMoviesUnderTrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoTrending();
        sidebarMenu.clickMoviesUnderTrending();
    }
    @Test
    public void goClickFashionUnderTrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoTrending();
        sidebarMenu.clickFashionUnderTrending();
    }
    @Test
    public void goClickSubscriptionNotSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoSubscription();
        sidebarMenu.verifySubscriptionPageNotSignIn();
    }
    @Test
    public void goClickSubscriptionSignInUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        Signing signing = PageFactory.initElements(this.driver, Signing.class);
        sidebarMenu.gotoSubscription();
        sidebarMenu.clickSubscriptionSignIn();
        signing.fillInUser();
        signing.fillInPass();
        signing.isYouTubeSearchBoxDisplayed();
    }
    @Test
    public void goClickLibraryNotSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoLibrary();
        sidebarMenu.verifyLibraryPageNotSignIn();
    }
    @Test
    public void goClickLibrarySignInUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        Signing signing = PageFactory.initElements(this.driver, Signing.class);
        sidebarMenu.gotoLibrary();
        sidebarMenu.clickLibrarySignIn();
        signing.fillInUser();
        signing.fillInPass();
        signing.isYouTubeSearchBoxDisplayed();
    }
    @Test
    public void goClickHistoryWatchHistoryNotSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoHistory();
        sidebarMenu.verifyHistoryUrlNotSignIn(this.driver);
    }
    @Test
    public void goClickHistoryWatchHistorySignInUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        Signing signing = PageFactory.initElements(this.driver, Signing.class);
        sidebarMenu.gotoHistory();
        sidebarMenu.clickHistorySignIn();
        signing.fillInUser();
        signing.fillInPass();
        signing.isYouTubeSearchBoxDisplayed();
    }
    @Test
    public void goClickSearchHistoryUnderHistory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoHistory();
        sidebarMenu.clickOptionSearchHistory();
        sidebarMenu.verifyPageSearchHistory();
    }
    @Test
    public void goClickCommentsUnderHistory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoHistory();
        sidebarMenu.clickOptionHistoryComments();
        sidebarMenu.verifyPageHistoryComments(this.driver);
    }
    @Test
    public void goClickCommunityUnderHistory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoHistory();
        sidebarMenu.clickOptionHistoryCommunity();
        sidebarMenu.verifyPageHistoryCommunity(this.driver);
    }
    @Test
    public void goClickLiveChatUnderHistory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoHistory();
        sidebarMenu.clickOptionHistoryLiveChat();
        sidebarMenu.verifyPageHistoryLiveChat(this.driver);
    }
    @Test
    public void gotoMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickMusicUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoSport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickSportUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoGaming() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickGamingUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoMovies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickMoviesUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoTvShows() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickTvShowsUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickNewsUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoLive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickLiveUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoFashion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickFashionUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void gotoSpotlight() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.clickSpotLightUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void goto360Video() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickOpenCloseSideBar();
        sidebarMenu.click360VideoUnderSectionBestOfYouTube(this.driver);
    }
    @Test
    public void goClickBrowseChannel() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.gotoBrowsingChannel();
        sidebarMenu.verifyBrowsePage(this.driver);
    }
    @Test
    public void goClickYoutubePremium() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickYouTubePremium(this.driver);
    }
    @Test
    public void goClickLive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickLive(this.driver);
    }
    @Test
    public void goClickSettingsNotSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickSettingsNotSignIn();
        sidebarMenu.isSettingSignInPageDisplayed(driver);
    }
    @Test
    public void goClickSettingSignInUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        Signing signing = PageFactory.initElements(this.driver, Signing.class);
        sidebarMenu.clickSettingsNotSignIn();
        signing.fillInUser();
        signing.fillInPass();
        signing.isYouTubeSearchBoxDisplayed();
    }
    @Test
    public void goClickReportHistory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickReportHistory();
    }
    @Test
    public void goClickHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickHelp(this.driver);
    }
    @Test
    public void goClickSendFeedback() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickSendFeedback(this.driver);
    }
    @Test
    public void clickAbout(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLink(this.driver);
    }
    @Test
    public void clickAboutOnOtherLinks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkOtherLinks(this.driver);
    }
    @Test
    public void clickAboutOnExperience(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkExperience(this.driver);
    }
    @Test
    public void clickAboutOnPolicyAndSafety(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkPolicies(this.driver);
    }
    @Test
    public void clickAboutCopyright(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkCopyright(this.driver);
    }
    @Test
    public void clickAboutBrandResources(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkBrandResources(this.driver);
    }
    @Test
    public void clickAboutPress(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkPress(this.driver);
    }
    @Test
    public void clickAboutHelpCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkHelpCenter(this.driver);
    }
    @Test
    public void clickAboutCreatorHub(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkCreatorHub(this.driver);
    }
    @Test
    public void clickAboutDevelopers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkDevelopers(this.driver);
    }
    @Test
    public void clickAboutAdvertisers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAboutLinkAdvertisers(this.driver);
    }
    @Test
    public void clickPress(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickPressLink(this.driver);
    }
    @Test
    public void clickCopyright(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickCopyrightLink(this.driver);
    }
    @Test
    public void clickContactUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickContactUsLink(this.driver);
    }
    @Test
    public void clickCreators(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickCreatorsLink(this.driver);
    }
    @Test
    public void clickAdvertise(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickAdvertiseLink(this.driver);
    }
    @Test
    public void clickDevelopers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickDevelopersLink(this.driver);
    }
    @Test
    public void clickTerms(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickTermsLink(this.driver);
    }
    @Test
    public void clickPrivacy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickPrivacyLink(this.driver);
    }
    @Test
    public void clickPolicyAndSafety(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickPolicyAndSafetyLink(this.driver);
    }
    @Test
    public void clickTestNewFeatures(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sidebarMenu = PageFactory.initElements(this.driver, SidebarMenu.class);
        sidebarMenu.clickTestNewFeaturesLink(this.driver);
    }
}
