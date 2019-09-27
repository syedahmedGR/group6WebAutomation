package SignUp;

import common.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.object.HomePage;

public class SignUpTest extends CommonAPI {
    public SignUpTest(){
        super();
    }
    @Test
    public void successfulSignUp(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.signIn("alamgirhossain1984@gmail.com","515674");
    }
}
