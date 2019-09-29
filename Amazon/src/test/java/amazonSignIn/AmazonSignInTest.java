package amazonSignIn;

import common.CommonAPI;
import org.testng.annotations.Test;

public class AmazonSignInTest extends CommonAPI {

    @Test
    public void verifyAccountSignIn() {
        clickOnElement("#nav-link-accountList");
        typeOnElement("ap_email","alamgirhossain1984@gmail.com");
        clickOnElement("#continue");
        typeOnElement("ap_password","1234567");
        clickOnElement(".a-button-input");
    }
    @Test
    public void verifyRegisterGiftCard(){
        clickOnElement("//a[contains(text(),'Gift Cards')]");
        clickOnElement("//a[contains(text(),'Redeem an Amazon Gift Card')]");
        clickOnElement("//a[contains(text(),'Create your Amazon account')]");
        typeOnElement("ap_customer_name","Alamgir");
        typeOnElement("#ap_email","alaviusanyc@yahoo.com");
    }
    @Test
    public void verifyList(){
        clickOnElement("//span[contains(text(),'Account & Lists')]");
        clickOnElement("nav-text");
        clickOnElement("a-fixed-right-grid-inner");
    }

    @Test
    public void collectOrder(){
        clickOnElement("nav-orders");
    }

    @Test
    public void verifyIcon(){
        clickByXpath("//*[@id=\"nav-hamburger-menu\"]");
    }

    @Test
    public void verifyShopbop(){
        clickOnElement("//a[contains(text(),'Shopbop')]");
    }

    @Test
    public void neighborsAppVerify(){
        clickOnElement("//a[contains(text(),'Neighbors App ')]");
    }

    @Test
    public void verifyBoxOffice(){
        clickOnElement("//a[contains(text(),'Box Office Mojo')]");
    }

    @Test
    public void SelectAmazonFresh(){
        clickOnElement("//a[contains(text(),'AmazonFresh')]");
    }

    @Test
    public void verifyBookDepository(){
        clickOnElement("//a[contains(text(),'Book Depository')]");
    }

    @Test
    public void selectBookDrive(){
        clickOnElement("//a[contains(text(),'Amazon Drive')]");
    }

    @Test
    public void verifySubscribeButton(){
        clickOnElement("//a[contains(text(),'Subscribe with Amazon')]");
    }

    @Test
    public void inspireSelect(){
        clickOnElement("//a[contains(text(),'Amazon Inspire')]");
    }

    @Test
    public void verifyPageAlexa(){
        clickOnElement("//a[contains(text(),'Alexa')]");
    }

    @Test
    public void creteSpaceSelect(){
        clickOnElement("//a[contains(text(),'CreateSpace')]");
    }

   @Test
    public void enrollHomeServices(){
        clickOnElement("//a[contains(text(),'Home Services')]");
   }

    @Test
    public void verifyPillPackPharmacy(){
        clickOnElement("//a[contains(text(),'PillPack'");
    }

    @Test
    public void PlayDirectVideo(){
        clickOnElement("//a[contains(text(),'Prime Video Direct')]");
        clickByXpath("//*[@id=\"dvp-landing-main\"]/div/div/video");
    }

    @Test
    public void buildInvestorRelation(){
       clickOnElement("//a[contains(text(),'Investor Relations')]");
    }

    @Test
    public void selelctAmazonTour(){
       clickOnElement("//a[contains(text(),'Amazon Tours')]");
    }

    @Test
    public void verifyPressCenter(){
       clickOnElement("//a[contains(text(),'Press Center')]");
    }

    @Test
    public void clickAbcBooks(){
       clickOnElement("//a[contains(text(),'AbeBooks')]");
    }


   }



