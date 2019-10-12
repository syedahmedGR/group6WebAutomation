package home;

import common.CommonAPI;
import homepage.HomePage;
import homepage.MouseHover;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMouseHover extends CommonAPI {
    @Test(priority = 1)
    public void testMouseHover()throws Exception{
       MouseHover mouseHover = PageFactory.initElements(driver, MouseHover.class);
        mouseHover.mouseHoverGrocery();
    }
    @Test(priority = 2)
    public void testBusinessDelivery()throws Exception{
        MouseHover mouseHover =PageFactory.initElements(driver,MouseHover.class);
        mouseHover.businessDelivery();
    }
    @Test(priority = 3)
    public void testShopAllDepartments()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        mouseHover.shopAllDepartments();
    }
    @Test(priority = 4)
    public void testOptical()throws Exception{
        MouseHover mouseHover=PageFactory.initElements(driver,MouseHover.class);
        mouseHover.optical();
    }
    @Test(priority = 5)
    public void testPharmacy()throws Exception{
        MouseHover mouseHover=PageFactory.initElements(driver,MouseHover.class);
        mouseHover.pharmacy();
    }
    @Test(priority = 6)
    public void testServices()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        mouseHover.services();
    }
    @Test(priority = 7)
    public void testPhoto()throws Exception{
        MouseHover mouseHover=PageFactory.initElements(driver,MouseHover.class);
        mouseHover.photo();
    }
    @Test(priority = 8)
    public void testTravel()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        mouseHover.travel();
    }
    @Test(priority = 9)
    public void testMembership()throws Exception{
        MouseHover mouseHover=PageFactory.initElements(driver,MouseHover.class);
        mouseHover.membership();
    }
    @Test(priority = 10)
    public void testChange()throws Exception{
        MouseHover mouseHover=PageFactory.initElements(driver,MouseHover.class);
        mouseHover.change();
    }
    @Test(priority = 11)
    public void testLinkUS()throws Exception{
        MouseHover mouseHover = PageFactory.initElements(driver,MouseHover.class);
        mouseHover.linkUS();
    }
    @Test(priority = 12)
    public void testLinkFindWarehouse()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        mouseHover.linkFindWarehouse();
    }
    @Test(priority = 13)
    public void testImageMattresses()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        sleepFor(4);
        mouseHover.imageMattresses();
        sleepFor(4);
    }
    @Test(priority = 14)
    public void testImageBathroom()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        sleepFor(3);
        mouseHover.imageBathroom();
        sleepFor(3);
    }
    @Test(priority = 15)
    public void testImageAppliances()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        sleepFor(4);
        mouseHover.imageAppliances();
        sleepFor(4);
    }
    @Test(priority = 16)
    public void testImageComputers()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        sleepFor(4);
        mouseHover.imageComputers();
        sleepFor(4);
    }
    @Test(priority = 17)
    public void testOutdoorHeating()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        sleepFor(4);
        mouseHover.imageOutdoorHeating();
        sleepFor(4);
    }
    @Test(priority = 18)
    public void testFurnitureEssentials()throws Exception{
        MouseHover mouseHover= PageFactory.initElements(driver,MouseHover.class);
        sleepFor(4);
        mouseHover.imageFurnitureEssential();
        sleepFor(4);
    }
    @Test(priority = 19)
    public void testImageHotTubsAndSpas()throws Exception {
        MouseHover mouseHover = PageFactory.initElements(driver, MouseHover.class);
        sleepFor(4);
        mouseHover.imageHotTubsAndSpas();
        sleepFor(4);
    }
    @Test(priority = 20)
    public void testImageNutrition()throws Exception {
        MouseHover mouseHover = PageFactory.initElements(driver, MouseHover.class);
        sleepFor(4);
        mouseHover.imageNutrition();
        sleepFor(4);
    }
    @Test(priority = 21)
    public void testImageToys()throws Exception {
        MouseHover mouseHover = PageFactory.initElements(driver, MouseHover.class);
        sleepFor(4);
        mouseHover.imageToys();
        sleepFor(4);
    }
    @Test(priority = 22)
    public void testImageTvs()throws Exception {
        MouseHover mouseHover = PageFactory.initElements(driver, MouseHover.class);
        sleepFor(4);
        mouseHover.imageTvs();
        sleepFor(4);
    }
    @Test(priority = 23)
    public void testImageBeauty()throws Exception {
        MouseHover mouseHover = PageFactory.initElements(driver, MouseHover.class);
        sleepFor(4);
        mouseHover.imageBeauty();
        sleepFor(4);
    }
    @Test(priority = 24)
    public void testImageThisWeeksLooks()throws Exception {
        MouseHover mouseHover = PageFactory.initElements(driver, MouseHover.class);
        sleepFor(4);
        mouseHover.imageThisWeeksLooks();
        sleepFor(4);
    }
}
