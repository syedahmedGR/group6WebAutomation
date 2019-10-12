package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static common.CommonAPI.convertToString;

public class LogInPage {

    @FindBy(id = "email")
    WebElement homePageEmailWebElement;

    @FindBy(name = "pass")
    WebElement homePagePasswordWebElement;

    @FindBy(css = "input[type=submit]")   // customize css
     WebElement homePageLogInButttonWebElement;


    public void logIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.homePageEmailWebElement.sendKeys("kajol11377@yahoo.com");
        this.homePagePasswordWebElement.sendKeys("roushan55");
        this.homePageLogInButttonWebElement.click();
    }
}
