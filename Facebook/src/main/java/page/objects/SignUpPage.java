package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static common.CommonAPI.convertToString;

public class SignUpPage {

    @FindBy(name = "firstname")
    WebElement firstNameTextField;

    @FindBy(name = "lastname")
    WebElement lastNameTextField;

    @FindBy(name = "reg_email__")
    WebElement mobileNumOrEmailTextField;

    @FindBy(name = "reg_passwd__")
    WebElement newPassTextField;

    @FindBy(id = "month")
    WebElement birthDayMonthTextField;

    @FindBy(id = "day")
    WebElement birthDayDayTextField;

    @FindBy(id = "year")
    WebElement birthDayYearTextField;

    @FindBy(name = "sex")
    WebElement clickOnMaleRadioButton;

    @FindBy(linkText = "Sign Up")
    WebElement clickOnSignUpButton;

    public void signUp(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.firstNameTextField.sendKeys("David");
        this.lastNameTextField.sendKeys("senders");
        this.mobileNumOrEmailTextField.sendKeys("9294946038");
        this.newPassTextField.sendKeys("pntAstoria19");
        this.birthDayMonthTextField.sendKeys("May");
        this.birthDayDayTextField.sendKeys("5");
        this.birthDayYearTextField.sendKeys("1948");
        this.clickOnMaleRadioButton.click();
        this.clickOnSignUpButton.click();
    }
}
