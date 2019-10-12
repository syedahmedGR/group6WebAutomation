package amazonItem;

import common.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class itemTest extends CommonAPI {

    @Test
    public void careersTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Careers')]");
    }
    @Test
    public void blogTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Blog')]");
    }
    @Test
    public void aboutAmazon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'About Amazon')]");
    }
    @Test
    public void pressCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Press Center')]");
    }
    @Test
    public void investorTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Investor Relations')]");
    }
    @Test
    public void devicesButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Amazon Devices')]");
    }
    @Test
    public void amazonToursInstruction(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Amazon Tours')]");
    }
    @Test
    public void makeMoney(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text())]");
    }
    @Test
    public void itemList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#twotabsearchtextbox", "Book");
    }
    @Test
    public void clickSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#twotabsearchtextbox", "java");
    }
    @Test
    public void verifyScreen() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        takeScreenShot();
    }
    @Test
    public void verifySeeMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'See More')]");
    }
    @Test
    public void selfServiceVerify(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[contains(text(),'Self-Publish with Us')]");
    }
    @Test
    public void privateBrandsVerify (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[contains(text(),'Sell Under Private Brands')]");
    }
    @Test
    public void captureImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("product-image");
    }
       }
