package KeywordDriven;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI {
    @FindBy(xpath = "//div[@id='nav-signin-tooltip']")
    WebElement helloSignIn;
    @FindBy(css = "#createAccountSubmit")
    WebElement continueSignIn;
    @FindBy(css = "#ap_customer_name")
    WebElement nameTextField;
    @FindBy(id = "ap_email")
    WebElement emailTextField;
    @FindBy(css = "#ap_password")
    WebElement passwordTextField;
    @FindBy(name = "passwordCheck")
    WebElement passwordCheck;
    @FindBy(css = ".a-button-input")
    WebElement continueToFinish;

    public void createAccount() throws Exception {
        helloSignIn.click();
        continueSignIn.click();
        nameTextField.sendKeys("Alamgir");
        emailTextField.sendKeys("alamgirhossain1984@gmail.com");
        passwordTextField.sendKeys("123456");
        passwordCheck.sendKeys("123456");
        continueToFinish.click();
    }
}
