package amazonItem;


import common.CommonAPI;
import org.testng.annotations.Test;

import java.io.IOException;

public class itemTest extends CommonAPI {

    @Test
    public void careersTest(){
        clickByXpath("//a[contains(text(),'Careers')]");
    }

    @Test
    public void blogTest(){
        clickByXpath("//a[contains(text(),'Blog')]");
    }

    @Test
    public void aboutAmazon(){
        clickByXpath("//a[contains(text(),'About Amazon')]");
    }

    @Test
    public void pressCenter(){
        clickOnElement("//a[contains(text(),'Press Center')]");
    }

    @Test
    public void investorTest(){
        clickByXpath("//a[contains(text(),'Investor Relations')]");
    }

    @Test
    public void devicesButtonTest(){
        clickByXpath("//a[contains(text(),'Amazon Devices')]");
    }

    @Test
    public void amazonToursInstruction(){
        clickByXpath("//a[contains(text(),'Amazon Tours')]");
    }

    @Test
    public void makeMoney(){
        clickByXpath("//a[contains(text())]");
    }

    @Test
    public void itemList(){
        typeOnElement("#twotabsearchtextbox", "Book");
    }

    @Test
    public void clickSearch(){
        typeOnElement("#twotabsearchtextbox", "java");
    }

    @Test
    public void verifyScreen() throws IOException {
        takeScreenShot();
    }

    @Test
    public void verifySeeMore(){
        clickByXpath("//a[contains(text(),'See More')]");
    }

    @Test
    public void selfServiceVerify(){
        clickOnElement("//a[contains(text(),'Self-Publish with Us')]");
    }

    @Test
    public void privateBrandsVerify (){
        clickByXpath("//a[contains(text(),'Sell Under Private Brands')]");
    }

    @Test
    public void captureImage(){
        clickOnElement("product-image");
    }
       }
