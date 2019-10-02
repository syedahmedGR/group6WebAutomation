package homewalmart;

import common.CommonAPI;
import home.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    HomePage homePage;

    @BeforeMethod
    public void initializeWalmartTestHome(){
        this.homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test (priority = 0)
    public void verifyHomePageTitleTest() throws Exception{
        String title = homePage.getHomePageTitle();
        System.out.println("home page title is " + title);
        Assert.assertEquals(title,"Walmart.com | Save Money. Live Better.");
    }

    @Test(priority = 1)
    public void verifyIsHomePageIconDisplayed() throws Exception {
        Assert.assertTrue( homePage.isHomePageIconDisplayed());
    }

    @Test(priority = 2)
    public void verifyIsHomePageGroceryIconDisplayed() throws Exception {
        Assert.assertTrue( homePage.isHomePageGroceryIconDisplayed());
    }

    @Test(priority = 3)
    public void verifyIsHomePageStoresIconDisplayed() throws Exception {
        Assert.assertTrue( homePage.isHomePageStoresIconDisplayed());
    }
    @Test(priority = 4)
    public void verifyIsHomePageMenuIconDisplayed() throws Exception {
        Assert.assertTrue( homePage.isHomePageMenuIconDisplayed());
    }
    @Test(priority = 5)
    public void verifyIsHomePageGroceryPickUpDisplayed() throws Exception {
        Assert.assertTrue( homePage.isHomePageGroceryPickUDisplayed());
    }
}
