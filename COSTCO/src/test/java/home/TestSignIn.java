package home;

import common.CommonAPI;
import homepage.Register;
import homepage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignIn extends CommonAPI {
    @Test
    public void testSignUp()throws Exception{
        SignIn signIn = PageFactory.initElements(driver, SignIn.class);
        signIn.clickSignIn();
    }
}
