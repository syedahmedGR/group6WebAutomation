package home;

import common.CommonAPI;
import homepage.Register;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestRegister extends CommonAPI {

    @Test
    public void testRegister()throws Exception{
        Register signUp = PageFactory.initElements(driver, Register.class);
        signUp.createAccount();
    }
}
