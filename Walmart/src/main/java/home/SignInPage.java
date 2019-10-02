package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends CommonAPI {

    // username, password -> submitbutton calling from handling cookies
    HandlingCookies handlingCookies = PageFactory.initElements(driver, HandlingCookies.class);

    public void signIn(){
        handlingCookies.typeUserNamePassword();
    }
}
