package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class HomePage  extends CommonAPI{

    // CNN module updated upto Sep 30, 2019 at 1pm

    public static String homePageTtile = "CNN - Breaking News, Latest News and Videos";

    @FindBy(xpath = "//a[@name='politics'][contains(text(),'Politics')]")
    WebElement homePageTitlePoliticsWebElement;

    @FindBy(xpath = "//a[text()='US']")
    WebElement homePageTitleUSWebElement;

    @FindBy(className = "menu-icon")
    WebElement homePageMenuWebElement;

    @FindBy(name = "world")
    WebElement homePageTitleWorldWebElement;

    @FindBy(name = "business")
    WebElement homePageTitleBusinessWebElement;

    @FindBy(name = "opinions")
    WebElement homePageTitleOpinionsWebElement;

    @FindBy(name = "health")
    WebElement homePageTitleHealthWebElement;

    @FindBy(name = "entertainment")
    WebElement homePageTitleEntertainmentWebElement;

    @FindBy(name = "style")
    WebElement homePageTitleStyleWebElement;

    @FindBy(name = "travel")
    WebElement homePageTitleTravelWebElement;

    @FindBy(name = "bleacher")
    WebElement homePageTitleSportsrWebElement;

    @FindBy(name = "videos")
    WebElement homePageTitleVideosWebElement;

    public WebElement getHomePageTitlePoliticsWebElement(){ return homePageTitlePoliticsWebElement;}
    public WebElement getHomePageTitleUSWebElement(){ return homePageTitleUSWebElement;}
    public WebElement getHomePageMenuWebElement(){ return homePageMenuWebElement;}
    public WebElement getHomePageTitleWorldWebElement(){ return homePageTitleWorldWebElement;}
    public WebElement getHomePageTitleBusinessWebElement(){ return homePageTitleBusinessWebElement;}
    public WebElement getHomePageTitleOpinionsWebElement(){ return homePageTitleOpinionsWebElement;}
    public WebElement getHomePageTitleHealthWebElement(){ return homePageTitleHealthWebElement;}
    public WebElement getHomePageTitleEntertainmentWebElement(){ return homePageTitleEntertainmentWebElement;}
    public WebElement getHomePageTitleStyleWebElement(){ return homePageTitleStyleWebElement;}
    public WebElement getHomePageTitleTravelWebElement(){ return homePageTitleTravelWebElement;}
    public WebElement getHomePageTitleSportsrWebElement(){ return homePageTitleSportsrWebElement;}
    public WebElement getHomePageTitleVideosWebElement(){ return homePageTitleVideosWebElement;}

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public boolean isUSHeadTitleDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleUSWebElement().isDisplayed();
    }
    public boolean isPoliticsTitleDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitlePoliticsWebElement().isDisplayed();
    }
    public boolean isHomePageMenuDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageMenuWebElement().isDisplayed();
    }
    public boolean isHomePageTitleWorldDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleWorldWebElement().isDisplayed();
    }
    public boolean isHomePageTitleBusinessDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleBusinessWebElement().isDisplayed();
    }
    public boolean isHomePageTitleOpinionsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleOpinionsWebElement().isDisplayed();
    }
    public boolean isHomePageTitleHealthDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleHealthWebElement().isDisplayed();
    }
    public boolean isHomePageTitleEntertainmentDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleEntertainmentWebElement().isDisplayed(); }
    public boolean isHomePageTitleStyleDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleStyleWebElement().isDisplayed();
    }
    public boolean isHomePageTitleTraveDislplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleTravelWebElement().isDisplayed();
    }
    public boolean isHomePageTitleSportsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleSportsrWebElement().isDisplayed();
    }
    public boolean isHomePageTitleVideosDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageTitleVideosWebElement().isDisplayed();
    }

}
