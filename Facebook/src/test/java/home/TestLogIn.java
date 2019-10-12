package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.objects.LogInPage;

public class TestLogIn extends CommonAPI {

    @Test
    public void testLogIn(){
        LogInPage logInPage = PageFactory.initElements(driver,LogInPage.class);
        logInPage.logIn();
    }
}
