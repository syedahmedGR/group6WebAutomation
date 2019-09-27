package page.object;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(id = "ap_email")
    WebElement emailTextField;

    @FindBy(id = "continue")
    WebElement  continueClickField;

    @FindBy(id = "password")
    WebElement passwordTextField;

    @FindBy (id = "signInSubmit")
    WebElement signInButton;

    public void signIn(String email, String password){
        this.emailTextField.sendKeys(email);
        this.continueClickField.click();
        this.passwordTextField.sendKeys(password);
        this.signInButton.click();
    }


}
