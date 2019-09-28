package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SnapShot {
    @FindBy(name = "world")
    WebElement homePageWorldLinkWebElement;

    @FindBy(xpath = "//h1[@class='metadata-header__title']")
    WebElement worldTitleWebElement;

    public WebElement getHomePageWorldLinkWebElement(){ return homePageWorldLinkWebElement;}
    public WebElement getWorldTitleWebElement(){ return worldTitleWebElement;}

    /*public String getHomePageTitle() {
        return driver.getTitle();
    }*/

    public boolean isWorldTitleDisplayed(){
        getHomePageWorldLinkWebElement().click();
        System.out.println(getWorldTitleWebElement().isDisplayed());
       return getWorldTitleWebElement().isDisplayed();
    }

}
