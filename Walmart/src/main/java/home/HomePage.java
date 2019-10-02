package home;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends CommonAPI{

    @FindBy(xpath = "//a[@id='vh-home-link']//span[@class='g_a g_i']")
    WebElement homePageIconWebElement;

    @FindBy(xpath = "//span[text()='Grocery']")
    WebElement homePageGroceryIconWebElement;

    @FindBy(xpath = "//span[text()='Stores']")
    WebElement homePageStoresIconWebElement;

    @FindBy(xpath = "//button[@class='f_a ak_c f_c']//span[@class='f_b']]")
    WebElement homePageMenuIconWebElement;

    @FindBy(xpath = "//a[@class='i_a vf-footer-link i_c'][contains(text(),'Grocery Pickup & Delivery')]")
    WebElement homePageGroceryPickUPWebElement;

    @FindBy(xpath = "//a[contains(text(),'MoneyCenter')]")
    WebElement homePageMoneyCenterWebElement;

    public String getHomePageTitle() {
        return driver.getTitle();
    }
    public WebElement getHomePageIconWebElement(){ return homePageIconWebElement;}
    public WebElement getHomePageGroceryIconWebElement(){ return homePageGroceryIconWebElement;}
    public WebElement getHomePageStoresIconWebElement(){ return homePageStoresIconWebElement;}
    public WebElement getHomePageMenuIconWebElement(){ return homePageMenuIconWebElement;}
    public WebElement getHomePageGroceryPickUpWebElement(){ return homePageGroceryPickUPWebElement;}

    public boolean isHomePageIconDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageIconWebElement().isDisplayed();
    }
    public boolean isHomePageGroceryIconDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageGroceryIconWebElement().isDisplayed();
    }
    public boolean isHomePageStoresIconDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageStoresIconWebElement().isDisplayed();
    }
    public boolean isHomePageMenuIconDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageMenuIconWebElement().isDisplayed();
    }
    public boolean isHomePageGroceryPickUDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageGroceryPickUpWebElement().isDisplayed();
    }
}
