package main;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    @FindBy(css = "input[id=search]")
    WebElement youTubeSearchBox;
    @FindBy(xpath = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/ytd-topbar-logo-renderer/a/div[1]")
    WebElement youTubeLogo;

    public WebElement getYouTubeSearchBox(){ return youTubeSearchBox; }
    public WebElement getYouTubeLogo(){ return youTubeLogo; }

    public boolean isYouTubeLogoDisplayed(){
        return this.getYouTubeLogo().isDisplayed();
    }

    public boolean isYouTubeSearchBoxDisplayed(){
        return this.getYouTubeSearchBox().isDisplayed();
    }

    public void verifyYouTubeLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(isYouTubeLogoDisplayed());
    }

    public void verifyYouTubeSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(isYouTubeSearchBoxDisplayed());
    }

}
