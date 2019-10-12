package amazonSignIn;

import common.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AmazonSignInTest extends CommonAPI {

    @Test
    public void verifyAccountSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav-link-accountList");
        typeOnElement("ap_email","alamgirhossain1984@gmail.com");
        clickOnElement("#continue");
        typeOnElement("ap_password","1234567");
        clickOnElement(".a-button-input");
    }
    @Test
    public void verifyRegisterGiftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Gift Cards')]");
        clickOnElement("//a[contains(text(),'Redeem an Amazon Gift Card')]");
        clickOnElement("//a[contains(text(),'Create your Amazon account')]");
        typeOnElement("ap_customer_name","Alamgir");
        typeOnElement("#ap_email","alaviusanyc@yahoo.com");
    }
    @Test
    public void verifyList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//span[contains(text(),'Account & Lists')]");
        clickOnElement("nav-text");
        clickOnElement("a-fixed-right-grid-inner");
    }
    @Test
    public void collectOrder(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("nav-orders");
    }
    @Test
    public void verifyIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"nav-hamburger-menu\"]");
    }
    @Test
    public void verifyShopbop(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Shopbop')]");
    }

    @Test
    public void neighborsAppVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Neighbors App ')]");
    }
    @Test
    public void verifyBoxOffice(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Box Office Mojo')]");
    }
    @Test
    public void SelectAmazonFresh(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'AmazonFresh')]");
    }
    @Test
    public void verifyBookDepository(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Book Depository')]");
    }
    @Test
    public void selectBookDrive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Amazon Drive')]");
    }
    @Test
    public void verifySubscribeButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Subscribe with Amazon')]");
    }
    @Test
    public void inspireSelect(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Amazon Inspire')]");
    }
    @Test
    public void verifyPageAlexa(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Alexa')]");
    }
    @Test
    public void creteSpaceSelect(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'CreateSpace')]");
    }
    @Test
    public void enrollHomeServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Home Services')]");
   }
   @Test
    public void verifyPillPackPharmacy(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'PillPack'");
    }
    @Test
    public void PlayDirectVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Prime Video Direct')]");
        clickByXpath("//*[@id=\"dvp-landing-main\"]/div/div/video");
    }
    @Test
    public void buildInvestorRelation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickOnElement("//a[contains(text(),'Investor Relations')]");
    }
    @Test
    public void selelctAmazonTour(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Amazon Tours')]");
    }
    @Test
    public void verifyPressCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickOnElement("//a[contains(text(),'Press Center')]");
    }
    @Test
    public void clickAbcBooks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'AbeBooks')]");
    }


   }



