package helloAccount;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import reporting.TestLogger;

public class TestHomePage extends CommonAPI {
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
    public void verifyLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.locationCheck();
    }
     @Test
     public void verifyAddCart() throws Exception{
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.gameAdd();
     }
    @Test
    public void verifyBabyProduct(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.buyBabyDiaper();
    }
    @Test
    public void verifyBuyCreamAndOintments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.buyCreamAndOintments();
    }
    @Test
    public void verifyGiftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePageObj.giftCard();
    }
      @Test
      public void verifyPrimeMember(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
          homePageObj.primeMember();
      }
      @Test
     public void allDepartments(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
          homePageObj.departments();
    }

}
