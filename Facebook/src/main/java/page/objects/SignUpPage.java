package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    @FindBy(id = "u_0_n")
    WebElement firstNameTextField;

    @FindBy(id = "u_0_p")
    WebElement lastNameTextField;

    @FindBy(id = "u_0_s")
    WebElement mobileNumOrEmailTextField;

    @FindBy(id = "u_0_z")
    WebElement newPassTextField;

    @FindBy(id = "month")
    WebElement birthDayMonthTextField;

    @FindBy(id = "id=\"day\"")
    WebElement birthDayDayTextField;

    @FindBy(id = "id=\"year\"")
    WebElement birthDayYearTextField;

    @FindBy(id = "u_0_6")
    WebElement clickOnFemaleRadipButton;

    @FindBy(id = "id=\"u_0_7\"")
    WebElement clickOnMaleRadioButton;

    @FindBy(id = "u_0_8")
    WebElement clickOnCustomRadioButton;

    @FindBy(name = "websubmit")
    WebElement clickOnSignUpButton;

    public void signUpPage(){

    }
}
