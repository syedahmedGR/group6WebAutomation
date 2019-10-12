package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.objects.SignUpPage;

public class TestSignUp extends CommonAPI {

    @Test
    public void testSignUp(){
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.signUp();
    }
}
