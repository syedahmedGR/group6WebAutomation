package homepage;

import common.CommonAPI;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void searchItemVerify(){
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
        System.out.println("testing changes through branch");
    }

    @Test
    public void locationCheck(){
        clickOnElement(".a-popover-trigger");
  }

    @Test
    public void checkDealsOfTheDay(){
        clickOnElement("#nav-xshop > a:nth-child(2)");
        clickOnElement("div.tile:nth-child(3) > a:nth-child(1) > div:nth-child(1)");
    }

    @Test
    public void myAmazonLogoVerify(){
        clickOnElement("nav-your-amazon");
        }

    @Test
        public void helpTab(){
           clickByXpath("//*[@id=\"nav-xshop\"]/a[4]");
    }

    @Test
    public void wholeFoods(){
        clickByXpath("//a[contains(text(),'Whole Food')]");
    }

    @Test
    public void registryPage(){
        clickByXpath("//a[contains(text(),'Registry')]");
     }

     @Test
    public void sellButton(){
         clickByXpath("//a[contains(text(),'Sell')]");
     }

    @Test
    public void eButton(){
        clickOnElement(".icp-nav-language");
    }

    @Test
    public void orderButtonCheck(){
        clickOnElement(".nav-line-2");
    }

    @Test
    public void PrimeButtonCheck(){
        clickByXpath("//*[@id=\"nav-link-prime\"]/span[2]");
    }

    @Test
    public void VerifyCartTest(){
        clickOnElement("nav-cart");
        clickOnElement("click_region");
    }

    @Test
    public void VerifySellPrivateBrand(){
        clickByXpath("//a[contains(text(),'Sell Under Private Brands')]");
    }

    @Test
    public void verifySellOnHandMadeProduct(){
        clickByXpath("//a[contains(text(),'Sell on Amazon Handmade')]");
    }

    @Test
    public void verifySellAppsAmazon(){
        clickByXpath("//a[contains(text(),'Sell Your Apps on Amazon')]");
    }

    @Test
    public void verifyAdvertisementProducts(){
        clickByXpath("//a[contains(text(),'Advertise Your Products')]");
    }

    @Test
    public void verifyPayment(){
        clickByXpath("//div[contains(text(),'Amazon Payment Products')]");
    }

    @Test
    public void verifyVisaSignatureCards(){
        clickByXpath("//a[contains(text(), 'Amazon Rewards Visa Signature Cards')]");
    }

    @Test
    public void verifyAmazonStoreCCard(){
        clickByXpath("//a[contains(text(), 'Amazon.com Store Card')]");
    }

    @Test
    public void pointsCardVerify(){
        clickByXpath("//a[contains(text(), 'Shop with Points')]");
    }

    @Test
    public void verifyReloadBlance(){
        clickByXpath("//a[contains(text(), 'Reload Your Balance')]");
    }

    @Test
    public void verifyCurrencyConvertButton(){
        clickByXpath("//a[contains(text(), 'Amazon Currency Converter')]");
    }

    @Test
    public void helpPeopleButtonVerify(){
        clickByXpath("//div[contains(text(),'Let Us Help You')]");
    }

    @Test
    public void verifyShippingRates(){
        clickByXpath("//a[contains(text(),'Shipping Rates & Policies')]");
    }

    @Test
    public void PrimeVerify(){
        clickByXpath("//a[contains(text(),'Learn more about Amazon Prime')]");
    }

    @Test
    public void returnsButtonVerify(){
        clickByXpath("//a[contains(text(),'Returns & Replacements')]");
    }

    @Test
    public void contentAndDeviceVerify(){
        clickByXpath("//a[contains(text(),'Manage Your Content and Devices')]");
    }

    @Test
    public void AssistantButtonVerify(){
        clickByXpath("//a[contains(text(),'Amazon Assistant')]");
    }

    @Test
    public void verifyMusicButton(){
        clickByXpath("//a[contains(text(),'Amazon Music')]");
    }

    @Test
    public void checkPrivacyNotice(){
        clickByXpath("//a[contains(text(),'Privacy Notice')]");
    }

    @Test
    public void verifyInterestBasedAds(){
        clickByXpath("//a[contains(text(),'Interest-Based Ads')]");
    }

    @Test
    public void verifySecondChance(){
        clickByXpath("//a[contains(text(),'Amazon Second Chance')]");
    }

    public void rapidsCheck(){
        clickByXpath("//a[contains(text(),'Amazon Rapids')]");
    }

      @Test
    public void writeOnSearchBox(){
        typeOnElementNEnter("twotabsearchtextbox","mac");
      }

      @Test
    public void verifyCountry(){
          clickByXpath("//*[@id=\"icp-touch-link-country\"]");
      }

      @Test
    public void verifyFlag(){
          clickByXpath("//*[@id=\"icp-touch-link-country\"]/span[1]");
      }

      @Test
    public void eastDAneButtonVerify(){
        clickByXpath("//a[contains(text(),'East Dane')]");
      }

      @Test
    public void verifyPrimeVideo(){
        clickByXpath("//a[contains(text(),'Prime Video Direct')]");
      }

      @Test
    public void wifiCheck(){
        clickByXpath("//a[contains(text(),'eero WiFi')]");
      }

      @Test
    public void verifyBusiness(){
        clickByXpath("//a[contains(text(),'Amazon Business')]");
      }

      @Test
      public void allItemsVerify(){

    }


}
