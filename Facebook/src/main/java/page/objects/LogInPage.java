package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

    @FindBy(id = "email")
    WebElement emailOrPhoneTextField;

    @FindBy(id = "pass")
    WebElement passwordTextField;

    @FindBy(xpath = "//*[@id=\"u_0_c\"]")
    WebElement clickOnLogInButton;

    public void logIn(){

    }
}
