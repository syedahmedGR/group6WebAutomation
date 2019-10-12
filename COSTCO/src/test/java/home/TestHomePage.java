package home;

import common.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    @Test
    public void initialize(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void verifyGetHomePageTitle() {
        String title = homePage.getCostcoTitle();
        Assert.assertEquals(title, "Welcome to Costco Wholesale");
        System.out.println("The page title is: " + title);
        Assert.assertEquals(title, "Welcome to Costco Wholesale");
    }
    @Test(priority = 1)
    public void verifyIsHomePageLinkViewWarehouseSavingsDisplayed()throws Exception{
        this.homePage = PageFactory.initElements(this.driver,HomePage.class);
        Assert.assertTrue(homePage.isHomepageLinkViewWarehouseSavingsDisplayed());
    }
    @Test(priority = 2)
    public void verifyIsHomepageLinkCustomerServiceDisplayed(){
        this.homePage = PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomepageLinkCustomerServiceDisplayed());
    }
    @Test(priority = 3)
    public void verifyIsHomepageSearchTextFieldDisplayed(){
        this.homePage = PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomepageSearchTextFieldDisplayed());
    }
    @Test(priority = 4)
    public void verifyIsHomepageSignInOrRegisterLinkDisplayed(){
        this.homePage=PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomepageSignInOrRegisterLinkDisplayed());
    }
    @Test(priority = 5)
    public void verifyIsHomepageCartLinkDisplayed(){
        this.homePage=PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomepageCartLinkDisplayed());
    }
    @Test(priority = 6)
    public void verifyIsHomePageLinkFindWarehouseDisplayed(){
        this.homePage=PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomePageLinkFindWarehouseDisplayed());
    }
    @Test(priority = 7)
    public void verifyIsHomePageLinkGetEmailOffersDisplayed(){
        this.homePage=PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomePageLinkGetEmailOffersDisplayed());
    }
    @Test(priority = 8)
    public void verifyIsHomePageLinkUSDisplayed(){
        this.homePage=PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomePageLinkUSDisplayed());
    }
    @Test(priority = 9)
    public void verifyIsHomePageLinkAllDisplayed(){
        this.homePage=PageFactory.initElements(driver,HomePage.class);
        Assert.assertTrue(homePage.isHomePageLinkAllDisplayed());
    }
    @Test(priority = 10)
    public void testLocations(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.locations();
    }
    @Test(priority = 11)
    public void testGrocery()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.mouseHoverGrocery();
    }
    @Test(priority = 12)
    public void testBusinessDelivery()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.businessDelivery();
    }
    @Test(priority = 13)
    public void testShopAllDepartments()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.shopAllDepartments();
    }
    @Test(priority = 14)
    public void testOptical()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.optical();
    }
    @Test(priority = 15)
    public void testPharmacy()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.pharmacy();
    }
    @Test(priority = 16)
    public void testServices()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.services();
    }
    @Test(priority = 17)
    public void testPhoto()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.photo();
    }
    @Test(priority = 18)
    public void testTravel()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.travel();
    }
    @Test(priority = 19)
    public void testMembership()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.membership();
    }
    @Test(priority = 20)
    public void testChange()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.change();
    }
    @Test(priority = 21)
    public void testImageLG()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.linkUS();
    }
    @Test(priority = 22)
    public void testLinkFindWareHouse()throws Exception{
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.linkFindWarehouse();
    }
    @Test(priority = 23)
    public void testImage2DayLink()throws Exception{
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        sleepFor(7);
        homePage.image2Day();
        sleepFor(7);
    }
    @Test(priority = 24)
    public void testImageSameDay()throws Exception{
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        sleepFor(7);
        homePage.imageSameDay();
        sleepFor(7);
    }
    @Test(priority = 25)
    public void testMattresses()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(8);
        homePage.mattresses();
    }
    @Test(priority = 26)
    public void testBathroom()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(6);
        homePage.bathroom();
        sleepFor(6);
    }
    @Test(priority = 27)
    public void testAppliances()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(6);
        homePage.bathroom();
        sleepFor(6);
    }
    @Test(priority = 28)
    public void testComputers()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.computers();
        sleepFor(3);
    }
    @Test(priority = 29)
    public void testOutdoorHeating()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.outdoorHeating();
        sleepFor(3);
    }
    @Test(priority = 30)
    public void testFurnitureEssentials()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.furnitureEssential();
    }
    @Test(priority = 31)
    public void testHotTubsAndSpas()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.hotTubsAndSpas();
    }
    @Test(priority = 32)
    public void testNutrition()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.nutrition();
    }
    @Test(priority = 33)
    public void testToys()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.toys();
    }
    @Test(priority = 34)
    public void testTVs()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.tvs();
    }
    @Test(priority = 35)
    public void testBeauty()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.beauty();
    }
    @Test(priority = 36)
    public void testThisWeeksLooks()throws Exception{
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        sleepFor(3);
        homePage.thisWeeksLooks();
    }
}
