package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Register extends CommonAPI {      //it runs no issue
    @FindBy(linkText = "Sign In / Register")
    WebElement clickOnRegisterLink;

    @FindBy(linkText = "Create Account")
    WebElement clickOnCreateAccount;

    @FindBy(css = "input[type = email")
    WebElement emailTextField;
    //"input[type=submit]")
    @FindBy(css = "input[type=password]")
    WebElement passwordTextField;

    @FindBy(xpath = "//*[@id=\"logonPasswordVerify\"]")
    WebElement confirmPasswordTextField;

    @FindBy(xpath = "//*[@id=\"RegisterForm\"]/fieldset/div[7]/input")
    WebElement clickOnCreateAccountButton;

    public void createAccount()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.clickOnRegisterLink.click();
        this.clickOnCreateAccount.click();
        this.emailTextField.sendKeys("kajol11373@gmail.com");
        Thread.sleep(3000);
        this.passwordTextField.sendKeys("kajolcostco111");
        Thread.sleep(3000);
        this.confirmPasswordTextField.sendKeys("kajolcostco111");
        Thread.sleep(5000);
        this.clickOnCreateAccountButton.click();
        Thread.sleep(3000);
    }
}
