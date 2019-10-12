package home;
import common.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHome extends CommonAPI {
    @Test
    public void searchItemVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
        System.out.println("testing changes through branch");
    }
    @Test
    public void locationCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement(".a-popover-trigger");
  }
    @Test
    public void checkDealsOfTheDay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav-xshop > a:nth-child(2)");
        clickOnElement("div.tile:nth-child(3) > a:nth-child(1) > div:nth-child(1)");
    }
    @Test
    public void myAmazonLogoVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("nav-your-amazon");
        }
        @Test
        public void helpTab(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
           clickByXpath("//*[@id=\"nav-xshop\"]/a[4]");
    }
    @Test
    public void wholeFoods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Whole Food')]");
    }
    @Test
    public void registryPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Registry')]");
     }
     @Test
    public void sellButton(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         clickByXpath("//a[contains(text(),'Sell')]");
     }
     @Test
    public void eButton(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement(".icp-nav-language");
    }
    @Test
    public void orderButtonCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement(".nav-line-2");
    }
    @Test
    public void PrimeButtonCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"nav-link-prime\"]/span[2]");
    }

    @Test
    public void VerifyCartTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("nav-cart");
        clickOnElement("click_region");
    }
    @Test
    public void VerifySellPrivateBrand(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Sell Under Private Brands')]");
    }
    @Test
    public void verifySellOnHandMadeProduct(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Sell on Amazon Handmade')]");
    }
    @Test
    public void verifySellAppsAmazon(){
        clickByXpath("//a[contains(text(),'Sell Your Apps on Amazon')]");
    }
    @Test
    public void verifyAdvertisementProducts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Advertise Your Products')]");
    }
    @Test
    public void verifyPayment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        clickByXpath("//div[contains(text(),'Amazon Payment Products')]");
    }
    @Test
    public void verifyVisaSignatureCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(), 'Amazon Rewards Visa Signature Cards')]");
    }
    @Test
    public void verifyAmazonStoreCCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(), 'Amazon.com Store Card')]");
    }
    @Test
    public void pointsCardVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(), 'Shop with Points')]");
    }
    @Test
    public void verifyReloadBlance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(), 'Reload Your Balance')]");
    }
    @Test
    public void verifyCurrencyConvertButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(), 'Amazon Currency Converter')]");
    }
    @Test
    public void helpPeopleButtonVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//div[contains(text(),'Let Us Help You')]");
    }
    @Test
    public void verifyShippingRates(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Shipping Rates & Policies')]");
    }
    @Test
    public void PrimeVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Learn more about Amazon Prime')]");
    }
    @Test
    public void returnsButtonVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Returns & Replacements')]");
    }
    @Test
    public void contentAndDeviceVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Manage Your Content and Devices')]");
    }
    @Test
    public void AssistantButtonVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Amazon Assistant')]");
    }
    @Test
    public void verifyMusicButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Amazon Music')]");
    }
    @Test
    public void checkPrivacyNotice(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Privacy Notice')]");
    }
    @Test
    public void verifyInterestBasedAds(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Interest-Based Ads')]");
    }
    @Test
    public void verifySecondChance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Amazon Second Chance')]");
    }
    @Test
    public void rapidsCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Amazon Rapids')]");
    }
    @Test
    public void writeOnSearchBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElementNEnter("twotabsearchtextbox","mac");
      }
      @Test
     public void verifyCountry(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
          clickByXpath("//*[@id=\"icp-touch-link-country\"]");
      }
      @Test
    public void verifyFlag(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//*[@id=\"icp-touch-link-country\"]/span[1]");
      }
      @Test
    public void eastDAneButtonVerify(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'East Dane')]");
      }
      @Test
    public void verifyPrimeVideo(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
          clickByXpath("//a[contains(text(),'Prime Video Direct')]");
      }
      @Test
    public void wifiCheck(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'eero WiFi')]");
      }
      @Test
    public void verifyBusiness() {
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Amazon Business')]");
      }
      @Test
      public void allItemsVerify(){
          TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }




}
