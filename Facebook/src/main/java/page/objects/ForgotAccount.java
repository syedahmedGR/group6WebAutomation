package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotAccount {

    @FindBy(linkText = "Forgot account?")
    WebElement clickOnForgotAccount;
}
