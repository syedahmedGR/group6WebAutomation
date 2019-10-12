package amazonItem;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import reporting.TestLogger;

public class HomePageTest extends CommonAPI {
    @BeforeMethod
    public void initialize() {
        homePageObj = PageFactory.initElements(driver, HomePage.class);
    }
    HomePage homePageObj = null;
    @Test
    public void verifyCreateAccount() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.createAccount();
    }
    @Test
    public void verifySearchItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.searchItem();
    }
    @Test
    public void selectLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.locationCheck();
    }
    @Test
    public void verifyGameAdd(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.gameAdd();
    }
    @Test
    public void verifyBuyBabyDiaper(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.buyBabyDiaper();
    }
    @Test
    public void VerifyToBuyCream(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.buyCreamAndOintments();
    }
    @Test
    public void signInForGiftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.giftCard();
    }




}
