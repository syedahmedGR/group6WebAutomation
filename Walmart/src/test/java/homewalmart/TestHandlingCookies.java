package homewalmart;

import common.CommonAPI;
import home.HandlingCookies;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHandlingCookies extends CommonAPI {

    HandlingCookies handlingCookies;

    @BeforeMethod
    public void initializeWalmartTestHome(){
        this.handlingCookies = PageFactory.initElements(driver, HandlingCookies.class);
    }
    @Test(priority = 0)
    public void verifyIsHomePageAccountDisplayed() throws Exception {
        Assert.assertTrue( handlingCookies.isHomePageAccountDisplayed());
    }
    @Test(priority = 1)
    public void verifyIsSignInSuccessful() throws Exception {
        handlingCookies.isSignInSuccessful();
    }
    @Test(priority = 2)
    public void verifyCreateCookiesSuccessful() throws Exception {
        handlingCookies.createCookies();

    }

}
