package homewalmart;

import common.CommonAPI;
import home.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignIn extends CommonAPI {

    SignInPage signInPage;

    @BeforeMethod
    public void initializeWalmartTestSignIn(){
        this.signInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @Test
    public void testSignIn(){
        signInPage.signIn();
    }
}
