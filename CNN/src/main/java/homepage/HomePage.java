package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class HomePage  extends CommonAPI{


    public static String homePageTtile = "CNN - Breaking News, Latest News and Videos";

    //@FindBy(xpath = "//title[text()='CNN - Breaking News, Latest News and Videos']")

    @FindBy(xpath = "//a[@name='politics'][contains(text(),'Politics')]")
    WebElement homePageTitlePoliticsWebElement;

    @FindBy(xpath = "//a[text()='US']")
    WebElement homePageTitleUSWebElement;

    public WebElement gethomePageTitlePoliticsWebElement(){ return homePageTitlePoliticsWebElement;}
    public WebElement getHomePageTitleUSWebElement(){ return homePageTitleUSWebElement;}


    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public boolean isUSHeadTitleDisplayed(){
        return getHomePageTitleUSWebElement().isDisplayed();
    }
    public boolean isPoliticsTitleDisplayed(){
        return gethomePageTitlePoliticsWebElement().isDisplayed();
    }

}
