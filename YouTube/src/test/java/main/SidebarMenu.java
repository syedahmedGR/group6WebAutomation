package main;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.Iterator;
import java.util.Set;

public class SidebarMenu extends CommonAPI {

    @FindBy(xpath = "/html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[1]/a")
    WebElement home;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[2]/a")
    WebElement trending;
    @FindBy(css = "#contents > ytd-channel-list-sub-menu-avatar-renderer:nth-child(1) > a")
    WebElement trending_music;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-shelf-renderer/div[1]/div[1]/div/h2/span")
    WebElement musicLabel;
    @FindBy(css = "#contents > ytd-channel-list-sub-menu-avatar-renderer:nth-child(2) > a")
    WebElement getTrending_gaming;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[2]/div[3]/ytd-shelf-renderer/div[1]/div[1]/div/h2/span")
    WebElement gamingLabel;
    @FindBy(css = "#contents > ytd-channel-list-sub-menu-avatar-renderer:nth-child(3) > a")
    WebElement getTrending_news;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-shelf-renderer/div[1]/div[1]/div/h2/span")
    WebElement newsLabel;
    @FindBy(css = "#contents > ytd-channel-list-sub-menu-avatar-renderer:nth-child(4) > a")
    WebElement getTrending_movies;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-shelf-renderer/div[1]/div[1]/div/h2/span")
    WebElement moviesLabel;
    @FindBy(css = "#contents > ytd-channel-list-sub-menu-avatar-renderer:nth-child(5) > a")
    WebElement getTrending_fashion;
    @FindBy(css = "#channel-header-container > a")
    WebElement fashionLabel;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[3]/a")
    WebElement subscription;
    @FindBy(css = "#contents > ytd-background-promo-renderer > yt-icon")
    WebElement subscriptionLabel_NotSignIn;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-background-promo-renderer/div[2]/ytd-button-renderer/a/paper-button")
    WebElement subscription_signIn;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[4]/a/yt-icon")
    WebElement library;
    @FindBy(css = "#contents > ytd-background-promo-renderer > yt-icon")
    WebElement libraryLabel_NotSignIn;
    @FindBy(xpath = "//ytd-button-renderer[@class='style-scope ytd-background-promo-renderer style-suggestive size-small']//paper-button[@id='button']")
    WebElement library_signIn;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[5]/a")
    WebElement history;
    @FindBy(css = "#message")
    WebElement history_Labeled_NotSignIn;
    @FindBy(xpath = "/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-message-renderer/div[2]/ytd-button-renderer/a/paper-button")
    WebElement history_signIn;
    @FindBy(css = "#header > ytd-text-header-renderer")
    WebElement searchHistoryLabeled;
    @FindBy(css = "#options > ytd-sub-feed-option-renderer:nth-child(2) > a > paper-radio-button")
    WebElement option_searchHistory;
    @FindBy(css = "#options > ytd-sub-feed-option-renderer:nth-child(3) > a > paper-radio-button")
    WebElement option_comments;
    @FindBy(css = "#options > ytd-sub-feed-option-renderer:nth-child(4) > a > paper-radio-button")
    WebElement option_community;
    @FindBy(css = "#options > ytd-sub-feed-option-renderer:nth-child(5) > a > paper-radio-button")
    WebElement option_liveChat;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[1]")
    WebElement music_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[2]")
    WebElement sport_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[3]")
    WebElement gaming_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[4]")
    WebElement movies_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[5]")
    WebElement tvShows_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[6]")
    WebElement news_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[7]")
    WebElement live_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[8]")
    WebElement fashion_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[9]")
    WebElement spotLight_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[10]")
    WebElement video360_bestOfYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[4]/div/ytd-guide-entry-renderer/a/paper-item")
    WebElement browseChannel;
    @FindBy(xpath = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/yt-icon-button[2]/button/yt-icon")
    WebElement sideBarButton;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[5]/div/ytd-guide-entry-renderer[1]")
    WebElement youTubePremium_moreFromYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[5]/div/ytd-guide-entry-renderer[2]")
    WebElement live_moreFromYouTube;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[6]/div/ytd-guide-entry-renderer[1]")
    WebElement settingsBtn;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[6]/div/ytd-guide-entry-renderer[2]")
    WebElement reportHistory;
    @FindBy(css = "#name")
    WebElement reportHistoryLabel;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[6]/div/ytd-guide-entry-renderer[3]")
    WebElement helpButton;
    @FindBy(css = "#dialog")
    WebElement helpInput;
    @FindBy(xpath = "/html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[6]/div/ytd-guide-entry-renderer[4]")
    WebElement sendFeedback;
    @FindBy(css = "#guide-links-primary > a:nth-child(1)")
    WebElement about;
    @FindBy(css = "body > header > div > button")
    WebElement aboutButtonOption;
    @FindBy(css = "body > header > div > div > div > div")
    WebElement about_displayMenuScroll;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--primary > ul > li:nth-child(2)")
    WebElement youTube_aboutExperience;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--primary > ul > li:nth-child(3)")
    WebElement youTube_aboutPolicies;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--primary > ul > li:nth-child(4)")
    WebElement youTube_aboutCopyright;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--primary > ul > li:nth-child(5)")
    WebElement youTube_aboutBrandResources;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--primary > ul > li:nth-child(6)")
    WebElement youTube_aboutPress;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--secondary > ul > li:nth-child(1)")
    WebElement youTube_aboutHelpCenter;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--secondary > ul > li:nth-child(2)")
    WebElement youTube_aboutCreatorHub;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--secondary > ul > li:nth-child(3)")
    WebElement youTube_aboutDevelopers;
    @FindBy(css = "body > header > div > div > div > div > div.site-menu__wrapper.js-menu-wrapper.js-show-element > nav.site-menu__nav.site-menu__nav--secondary > ul > li:nth-child(4)")
    WebElement youTube_aboutAdvertisers;
    @FindBy(css = "#guide-links-primary > a:nth-child(2)")
    WebElement press;
    @FindBy(css = "#guide-links-primary > a:nth-child(3)")
    WebElement copyright;
    @FindBy(css = "#guide-links-primary > a:nth-child(4)")
    WebElement contactUs;
    @FindBy(css = "#guide-links-primary > a:nth-child(5)")
    WebElement creators;
    @FindBy(css = "#guide-links-primary > a:nth-child(6)")
    WebElement advertise;
    @FindBy(css = "#guide-links-primary > a:nth-child(7)")
    WebElement developers;
    @FindBy(css = "#guide-links-secondary > a:nth-child(1)")
    WebElement terms;
    @FindBy(css = "#guide-links-secondary > a:nth-child(2)")
    WebElement privacy;
    @FindBy(css = "#guide-links-secondary > a:nth-child(3)")
    WebElement policyAndSafety;
    @FindBy(css = "#guide-links-secondary > a:nth-child(4)")
    WebElement testNewFeatures;

    public WebElement getHome(){ return home; }
    public WebElement getTrending(){ return trending; }
    public WebElement getTrending_music(){ return trending_music; }
    public WebElement getMusicLabel(){ return musicLabel; }
    public WebElement getTrending_gaming(){ return getTrending_gaming; }
    public WebElement getGamingLabel(){ return gamingLabel; }
    public WebElement getTrending_news(){ return getTrending_news; }
    public WebElement getNewsLabel(){ return newsLabel; }
    public WebElement getTrending_movies(){ return getTrending_movies; }
    public WebElement getMoviesLabel(){ return moviesLabel; }
    public WebElement getTrending_fashion(){ return getTrending_fashion; }
    public WebElement getFashionLabel(){ return fashionLabel; }
    public WebElement getSubscription(){ return subscription; }
    public WebElement getSubscriptionLabel_NotSignIn(){ return subscriptionLabel_NotSignIn; }
    public WebElement getSubscription_signIn(){ return subscription_signIn; }
    public WebElement getLibrary(){ return library; }
    public WebElement getLibraryLabel_NotSignIn(){ return libraryLabel_NotSignIn; }
    public WebElement getLibrary_signIn(){ return library_signIn; }
    public WebElement getHistory(){ return history; }
    public WebElement getHistory_Labeled_NotSignIn(){ return history_Labeled_NotSignIn; }
    public WebElement getHistory_signIn(){ return history_signIn; }
    public WebElement getSearchHistoryLabeled(){ return searchHistoryLabeled; }
    public WebElement getOption_searchHistory(){ return option_searchHistory; }
    public WebElement getOption_comments(){ return option_comments; }
    public WebElement getOption_community(){ return option_community; }
    public WebElement getOption_liveChat(){ return option_liveChat; }
    public WebElement getMusic_bestOfYouTube(){ return music_bestOfYouTube; }
    public WebElement getSport_bestOfYouTube(){ return sport_bestOfYouTube; }
    public WebElement getGaming_bestOfYouTube(){ return gaming_bestOfYouTube; }
    public WebElement getMovies_bestOfYouTube(){ return movies_bestOfYouTube; }
    public WebElement get_tvShows_bestOfYouTube(){ return tvShows_bestOfYouTube; }
    public WebElement getNews_bestOfYouTube(){ return news_bestOfYouTube; }
    public WebElement getLive_bestOfYouTube(){ return live_bestOfYouTube; }
    public WebElement getFashion_bestOfYouTube(){ return fashion_bestOfYouTube; }
    public WebElement getSpotLight_bestOfYouTube(){ return spotLight_bestOfYouTube; }
    public WebElement getVideo360_bestOfYouTube(){ return video360_bestOfYouTube; }
    public WebElement getBrowseChannel(){ return browseChannel; }
    public WebElement getSideBarButton(){ return sideBarButton; }
    public WebElement get_youTubePremium_moreFromYouTube(){ return youTubePremium_moreFromYouTube;}
    public WebElement getLive_moreFromYouTube(){ return live_moreFromYouTube; }
    public WebElement getSettingsBtn(){ return settingsBtn; }
    public WebElement getReportHistory(){ return reportHistory; }
    public WebElement getReportHistoryLabel(){ return reportHistoryLabel; }
    public WebElement getHelpButton(){ return helpButton; }
    public WebElement getHelpInput(){ return helpInput; }
    public WebElement getSendFeedback(){ return sendFeedback; }
    public WebElement getAbout(){ return about; }
    public WebElement getAboutButtonOption(){ return aboutButtonOption; }
    public WebElement getAbout_displayMenuScroll(){ return about_displayMenuScroll; }
    public WebElement getYouTube_aboutExperience(){ return youTube_aboutExperience; }
    public WebElement getYouTube_aboutPolicies(){ return youTube_aboutPolicies; }
    public WebElement getYouTube_aboutCopyright(){ return youTube_aboutCopyright; }
    public WebElement getYouTube_aboutBrandResources(){ return youTube_aboutBrandResources; }
    public WebElement getYouTube_aboutPress(){ return youTube_aboutPress; }
    public WebElement getYouTube_aboutHelpCenter(){ return youTube_aboutHelpCenter; }
    public WebElement getYouTube_aboutCreatorHub(){ return youTube_aboutCreatorHub; }
    public WebElement getYouTube_aboutDevelopers(){ return youTube_aboutDevelopers; }
    public WebElement getYouTube_aboutAdvertisers(){ return youTube_aboutAdvertisers; }
    public WebElement getPress(){ return press; }
    public WebElement getCopyright(){ return copyright; }
    public WebElement getContactingInfo(){ return contactUs; }
    public WebElement getCreators(){ return creators; }
    public WebElement getAdvertise(){ return advertise; }
    public WebElement getDevelopers(){ return developers; }
    public WebElement getTerms(){ return terms; }
    public WebElement getPrivacy(){ return privacy; }
    public WebElement getPolicyAndSafety(){ return policyAndSafety; }
    public WebElement getTestNewFeatures(){ return testNewFeatures; }

    private String getUrl_history = "https://www.youtube.com/feed/history/search_history";
    private String getUrl_historyComments = "https://www.youtube.com/feed/history/comment_history";
    private String getUrl_historyCommunity = "https://www.youtube.com/feed/history/community_history";
    private String getUrl_historyLiveChat = "https://www.youtube.com/feed/history/live_chat_history";
    private String getUrl_developers = "https://developers.google.com/youtube/";
    private String getUrl_contactUs = "https://www.youtube.com/t/contact_us";
    private String getUrl_advertise = "https://www.youtube.com/ads/";
    private String getUrl_newFeatures = "https://www.youtube.com/new";
    private String getUrl_browsing = "https://www.youtube.com/feed/guide_builder";

    public void clickOpenCloseSideBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sleepFor(5);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        getSideBarButton().click();
    }

    public void gotoHomeIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHome().click();
    }

    public void verifyHomePage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals("YouTube", driver.getTitle());
    }

    public void gotoTrending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.getTrending().click();
    }

    public void verifyTrendingPage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Trending - YouTube", driver.getTitle());
    }

    public void clickMusicUnderTrending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTrending_music().click();
        try{
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(isMusicLabelDisplayed());
    }

    public boolean isMusicLabelDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getMusicLabel().isDisplayed();
    }

    public void clickGamingUnderTrending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTrending_gaming().click();
        try{
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(isGamingLabelDisplayed());
    }

    public boolean isGamingLabelDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getGamingLabel().isDisplayed();
    }

    public void clickNewsUnderTrending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTrending_news().click();
        try{
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(isNewsLabelDisplayed());
    }

    public boolean isNewsLabelDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getNewsLabel().isDisplayed();
    }

    public void clickMoviesUnderTrending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTrending_movies().click();
        try{
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(isMoviesLabelDisplayed());
    }

    public boolean isMoviesLabelDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getMoviesLabel().isDisplayed();
    }

    public void clickFashionUnderTrending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTrending_fashion().click();
        try{
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(isFashionLabelDisplayed());
    }

    public boolean isFashionLabelDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getFashionLabel().isDisplayed();
    }

    public void gotoSubscription(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubscription().click();
    }

    public void clickSubscriptionSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubscription_signIn().click();
    }

    public void verifySubscriptionPageNotSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getSubscriptionLabel_NotSignIn().isDisplayed());
    }

    public void gotoLibrary(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLibrary().click();
    }

    public void clickLibrarySignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLibrary_signIn().click();
    }

    public void verifyLibraryPageNotSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getLibraryLabel_NotSignIn().isDisplayed());
    }

    public void gotoHistory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHistory().click();
    }

    public void clickHistorySignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHistory_signIn().click();
    }

    public void verifyHistoryUrlNotSignIn(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getHistory_Labeled_NotSignIn().isDisplayed());
    }

    public void clickOptionSearchHistory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOption_searchHistory().click();
    }

    public void verifyPageSearchHistory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(getSearchHistoryLabeled().isDisplayed());
    }

    public void clickOptionHistoryComments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOption_comments().click();
    }

    public void verifyPageHistoryComments(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getUrl_historyComments, driver.getCurrentUrl());
    }

    public void clickOptionHistoryCommunity(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOption_community().click();
    }

    public void verifyPageHistoryCommunity(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getUrl_historyCommunity, driver.getCurrentUrl());
    }

    public void clickOptionHistoryLiveChat(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOption_liveChat().click();
    }

    public void verifyPageHistoryLiveChat(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getUrl_historyLiveChat, driver.getCurrentUrl());
    }

    public void clickMusicUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            getMusic_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("The Music Channel - YouTube", driver.getTitle());
    }

    public void clickSportUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            getSport_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Sports - YouTube", driver.getTitle());
    }

    public void clickGamingUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            getGaming_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Gaming - YouTube", driver.getTitle());
    }

    public void clickMoviesUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getMovies_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Movies & Shows - YouTube", driver.getTitle());
    }

    public void clickTvShowsUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            get_tvShows_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Movies & Shows - YouTube", driver.getTitle());
    }

    public void clickNewsUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("News - YouTube", driver.getTitle());
    }

    public void clickLiveUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getLive_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Live - YouTube", driver.getTitle());
    }

    public void clickFashionUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getFashion_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Fashion - YouTube", driver.getTitle());
    }

    public void clickSpotLightUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getSpotLight_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("YouTube - YouTube", driver.getTitle());
    }

    public void click360VideoUnderSectionBestOfYouTube(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getVideo360_bestOfYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Virtual Reality - YouTube", driver.getTitle());
    }

    public void gotoBrowsingChannel(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getBrowseChannel().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void verifyBrowsePage(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(getUrl_browsing, driver.getCurrentUrl());
    }

    public void clickYouTubePremium(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            get_youTubePremium_moreFromYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("YouTube Premium - YouTube", driver.getTitle());
    }

    public void clickLive(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getLive_moreFromYouTube().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Live - YouTube", driver.getTitle());
    }

    public void clickSettingsNotSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getSettingsBtn().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void isSettingSignInPageDisplayed(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Signing signing = PageFactory.initElements(driver, Signing.class);
        signing.isHeadingText_onSignInPage_displayed();
    }

    public void clickReportHistory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getReportHistory().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(getReportHistoryLabel().isDisplayed());
    }

    public void clickHelp(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getHelpButton().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(getHelpButton().isEnabled());
    }

    public void clickSendFeedback(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getSendFeedback().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(getSendFeedback().isEnabled());
    }

    public void clickAboutLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("About YouTube - YouTube", driver.getTitle());
    }

    public void clickAboutLinkOtherLinks(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(getAbout_displayMenuScroll().isDisplayed());
    }

    public void clickAboutLinkExperience(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutExperience().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("YouTube Experiences - YouTube", driver.getTitle());
    }

    public void clickAboutLinkPolicies(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutPolicies().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Policies - YouTube", driver.getTitle());
    }

    public void clickAboutLinkCopyright(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutCopyright().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Copyright - YouTube", driver.getTitle());
    }

    public void clickAboutLinkBrandResources(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutBrandResources().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Brand Resources - YouTube", driver.getTitle());
    }

    public void clickAboutLinkPress(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutPress().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Press - YouTube", driver.getTitle());
    }

    public void clickAboutLinkHelpCenter(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutHelpCenter().click();
            handleNewTab(driver);
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("YouTube Help", driver.getTitle());
    }

    public void clickAboutLinkCreatorHub(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutCreatorHub().click();
            handleNewTab(driver);
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Creators | YouTube", driver.getTitle());
    }

    public void clickAboutLinkDevelopers(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutDevelopers().click();
            handleNewTab(driver);
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals(getUrl_developers, driver.getCurrentUrl());
    }

    public void clickAboutLinkAdvertisers(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAbout().click();
            sleepFor(7);
            getAboutButtonOption().click();
            sleepFor(7);
            getYouTube_aboutAdvertisers().click();
            handleNewTab(driver);
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("YouTube Advertisers - YouTube", driver.getTitle());
    }

    public void clickPressLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getPress().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Press - YouTube", driver.getTitle());
    }

    public void clickCopyrightLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getCopyright().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Copyright - YouTube", driver.getTitle());
    }

    public void clickContactUsLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getContactingInfo().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals(getUrl_contactUs, driver.getCurrentUrl());
    }

    public void clickCreatorsLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getCreators().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Creators | YouTube", driver.getTitle());
    }

    public void clickAdvertiseLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getAdvertise().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals(getUrl_advertise, driver.getCurrentUrl());
    }

    public void clickDevelopersLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getDevelopers().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("YouTube for Developers - YouTube", driver.getTitle());
    }

    public void clickTermsLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getTerms().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Terms of Service - YouTube", driver.getTitle());
    }

    public void clickPrivacyLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getPrivacy().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Privacy Policy – Privacy & Terms – Google", driver.getTitle());
    }

    public void clickPolicyAndSafetyLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getPolicyAndSafety().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals("Policies - YouTube", driver.getTitle());
    }

    public void clickTestNewFeaturesLink(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        try{
            driver.manage().window().fullscreen();
            sleepFor(7);
            getNews_bestOfYouTube().click();
            sleepFor(7);
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            actions.keyDown(Keys.SHIFT).sendKeys(Keys.PAGE_DOWN).perform();
            sleepFor(7);
            getTestNewFeatures().click();
            sleepFor(7);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertEquals(getUrl_newFeatures, driver.getCurrentUrl());
    }
}
