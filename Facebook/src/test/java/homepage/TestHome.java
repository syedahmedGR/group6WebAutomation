package homepage;

import common.CommonAPI;
import fbhome.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    HomePage homePage;

    @BeforeMethod
    public void initialize(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void verifyFBGetTitle(){
        String title = homePage.getFBTitle();
        System.out.println("home page title is " + title);
        Assert.assertEquals(title,"Facebook - Log In or Sign Up");
    }

    @Test(priority = 1)
    public void verifyIsFBHomePageEmailDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePageEmailDisplayed());
    }

    @Test(priority = 2)
    public void verifyIsFBHomePagePasswordDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePagePasswordDisplayed());
    }

    @Test(priority = 3)
    public void verifyIsFBHomePageForgotAccountDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePageForgotAccountDisplayed());
    }

    @Test(priority = 4)
    public void verifyIsFBHomePageSignUPDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePageSignUpDisplayed());
    }


}
