package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import reporting.TestLogger;

public class HomePage extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void initialize(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @FindBy(linkText = "View Warehouse Savings")
    WebElement homePageLinkViewWarehouseSavings;

    @FindBy(linkText = "Customer Service")
    WebElement homePageLinkCustomerService;

    @FindBy(id = "search-field")
    WebElement homePageSearchTextField;

    @FindBy(linkText = "Sign In / Register")
    WebElement homePageSignInOrRegisterLink;

    @FindBy(id ="cart-d")
    WebElement homePageCartLink;

    @FindBy(id = "warehouse-locations-dropdown")
    WebElement homePageLinkFindWarehouse;

    @FindBy(id = "email-signup-dropdown")
    WebElement homePageLinkGetEmailOffers;

    @FindBy(id = "country-select")
    WebElement homePageLinkUS;

    @FindBy(id ="search-dropdown-select")
    WebElement homePageLinkAll;

    @FindBy(linkText = "Locations")
    WebElement homePageLinkLocations;

    @FindBy(id = "country-select")
    WebElement homePageUSLink;

    @FindBy(id = "warehouse-locations-dropdown")
    WebElement linkFindWarehouse;

    @FindBy(xpath = "//*[@id=\"tiles-body-attribute\"]/div[10]/div/div[2]/div[2]/a/div/div[1]/div[1]")
    WebElement image2DayLink;

    @FindBy(xpath = "//*[@id=\"tiles-body-attribute\"]/div[10]/div/div[2]/div[1]/a/div/div[1]/div[1]")
    WebElement imageSameDayLink;

    @FindBy(xpath = "//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[1]/a/span/img")
    WebElement imageMattresses;

    @FindBy(xpath = "//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[2]/a/span/img")
    WebElement imageBathroom;

    @FindBy(xpath = "//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[5]/a/span/img")
    WebElement imageComputers;

    @FindBy(xpath = "//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[6]/a/span/img")
    WebElement imageOutdoorHeating;

    @FindBy(xpath = "//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[7]/a/span/img")
    WebElement imageFurnitureEssentials;

    public WebElement getHomePageLinkViewWarehouseSavings(){
        return homePageLinkViewWarehouseSavings;
    }
    public WebElement getHomepageLinkCustomerService(){
        return homePageLinkCustomerService;
    }
    public WebElement getHomePageSearchTextField(){
        return homePageSearchTextField;
    }
    public WebElement getHomePageSignInOrRegisterLink(){
        return homePageSignInOrRegisterLink;
    }
    public WebElement getHomePageCartLink(){
        return homePageCartLink;
    }
    public WebElement getHomePageLinkFindWarehouse(){
        return homePageLinkFindWarehouse;
    }
    public WebElement getHomePageLinkGetEmailOffers(){
        return homePageLinkGetEmailOffers;
    }
    public WebElement getHomePageLinkUS(){
        return homePageLinkUS;
    }
    public WebElement getHomePageLinkAll(){
        return homePageLinkAll;
    }
    public void locations(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.homePageLinkLocations.click();
    }
    public String getCostcoTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();
    }
    public boolean isHomepageLinkViewWarehouseSavingsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageLinkViewWarehouseSavings().isDisplayed();
    }
    public boolean isHomepageLinkCustomerServiceDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomepageLinkCustomerService().isDisplayed();
    }
    public boolean isHomepageSearchTextFieldDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageSearchTextField().isDisplayed();
    }
    public boolean isHomepageSignInOrRegisterLinkDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageSignInOrRegisterLink().isDisplayed();
    }
    public boolean isHomepageCartLinkDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageCartLink().isDisplayed();
    }
    public boolean isHomePageLinkFindWarehouseDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageLinkFindWarehouse().isDisplayed();
    }
    public boolean isHomePageLinkGetEmailOffersDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageLinkGetEmailOffers().isDisplayed();
    }
    public boolean isHomePageLinkUSDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageLinkUS().isDisplayed();
    }
    public boolean isHomePageLinkAllDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getHomePageLinkAll().isDisplayed();
    }
    public void mouseHoverGrocery()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.linkText("Grocery"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(5000);
    }
    public void businessDelivery()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.linkText("Business Delivery"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void shopAllDepartments()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.cssSelector("#navigation-dropdown"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void optical()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.linkText("Optical"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void pharmacy()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption= driver.findElement(By.linkText("Pharmacy"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void services()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption= driver.findElement(By.linkText("Services"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void photo()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.linkText("Photo"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void travel()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.linkText("Travel"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void membership()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.linkText("Membership"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void change()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath(" //*[@id=\"delivery-postal-change\"] "));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
    }
    public void linkUS()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.id("country-select"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
    public void linkFindWarehouse()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption= driver.findElement(By.id("warehouse-locations-dropdown"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
    public void image2Day()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(7);
        this.image2DayLink.click();
        sleepFor(7);
    }
    public void imageSameDay()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(7);
        this.imageSameDayLink.click();
        sleepFor(7);
    }
    public void mattresses()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[1]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(6);
    }
    public void bathroom()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[2]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
    }
    public void appliances()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[3]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
    }
    public void computers()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[5]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
    }
    public void outdoorHeating()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[6]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
    }
    public void furnitureEssential()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[7]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
    }
    public void hotTubsAndSpas()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[1]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
    public void nutrition()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[2]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
    public void toys()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[3]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
    public void tvs()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[5]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
    public void beauty()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[6]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
    public void thisWeeksLooks()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[7]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
    }
}