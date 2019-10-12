package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;     //it runs no issue
import reporting.TestLogger;

public class SignIn extends CommonAPI {
    @FindBy(linkText = "Sign In / Register")
    WebElement clickOnSignInLink;

    @FindBy(id = "logonId")
    WebElement emailtextfield;

    @FindBy(name = "logonPassword")
    WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Sign In']")  //customize xpath
    WebElement clickOnSignInButton;

    public void clickSignIn()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.clickOnSignInLink.click();
        this.emailtextfield.sendKeys("kajol11377@yahoo.com");
        this.passwordTextField.sendKeys("kajolcostco111");
        Thread.sleep(5000);
        this.clickOnSignInButton.click();
    }
}
