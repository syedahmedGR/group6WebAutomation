package testhome;

import common.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class TestHome extends CommonAPI {

    /*
    1. testcase-1 : should see the title of the page
    2. testcase-2: should see the US head/link
    3. testcase-3: should see the Politcs head/link
     */

    HomePage homePage;

    @Test
    public void initialize() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        //homePage.isClickedHomePage();
    }
    @Test(priority = 1)
    public void verifyIsUSHeadTitleDisplayed() throws Exception {
        //this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isUSHeadTitleDisplayed());
    }
    @Test (priority = 0)
    public void verifyHomePageTitleTest() throws Exception{
        //homePage = PageFactory.initElements(driver, HomePage.class);
        String title = homePage.getHomePageTitle();
        System.out.println("home page title is " + title);
        Assert.assertEquals(title,"CNN - Breaking News, Latest News and Videos");
    }
    @Test (priority =2)
    public void verifyIsPoliticsTitleDisplayed() throws Exception {
        //this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue(homePage.isPoliticsTitleDisplayed());
    }

}
