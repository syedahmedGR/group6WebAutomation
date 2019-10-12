package page;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage extends CommonAPI {
    @FindBy(xpath =  "//div[@id='nav-signin-tooltip']")
    WebElement helloSignIn;
    @FindBy(css = "#createAccountSubmit")
    WebElement  continueSignIn;
    @FindBy(css = "#ap_customer_name")
    WebElement nameTextField;
    @FindBy (id = "ap_email")
    WebElement emailTextField;
    @FindBy(css = "#ap_password")
    WebElement passwordTextField;
    @FindBy(name = "passwordCheck")
    WebElement passwordCheck;
    @FindBy(css = ".a-button-input")
    WebElement continueToFinish;
    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchProduct;
    @FindBy(xpath = "//a[@class='nav-a nav-a-2 a-popover-trigger a-declarative']")
    WebElement serchLocation;
    @FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
    WebElement sendOver;
    @FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
    WebElement bestSeller;
    @FindBy(css = ".p13n-sc-truncated")
    WebElement hasbroGaming;
    @FindBy(css = "#add-to-cart-button" )
    WebElement addToCart;
    @FindBy(xpath = "//a[contains(text(),'Baby')]")
    WebElement babyProduct;
    @FindBy(xpath = "//a[contains(text(),'Diapering')]")
    WebElement diapering;
    @FindBy(xpath = "//a[contains(text(),'Diaper Creams & Ointments')]")
    WebElement creamOintment;
    @FindBy(xpath = "//div[contains(text(),'Desitin Maximum Strength Baby Diaper Rash Cream wi')]")
    WebElement rashCream;
    @FindBy(xpath = "//a[@id='hlb-ptc-btn-native']")
    WebElement proceedToCheckOut;
    @FindBy(xpath = "//ul//a[contains(text(),'Gift Cards')]")
    WebElement clickOnGiftCards;
    @FindBy(xpath = "//ul//a[contains(text(),'Birthday')]")
    WebElement birthdayCard;
    @FindBy(css = " #nav-link-prime" )
    WebElement prime;
    @FindBy(className = "prime-cta-signup-button-input")
    WebElement primeSignUp;
    @FindBy(css = "#searchDropdownBox")
    WebElement searchDropDown;

    public void createAccount () throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helloSignIn.click();
        continueSignIn.click();
        nameTextField.sendKeys("Alamgir");
        emailTextField.sendKeys("alamgirhossain1984@gmail.com");
        passwordTextField.sendKeys("123456");
        passwordCheck.sendKeys("123456");
        continueToFinish.click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Amazon Sign-In");
    }
    public void searchItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchProduct.sendKeys("Football");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }
    public void locationCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        serchLocation.click();
        sendOver.sendKeys("10038");
    }
    public void gameAdd(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bestSeller.click();
        hasbroGaming.click();
        addToCart.click();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Amazon.com: LeapFrog Mr. Pencil's Scribble and Write: Toys & Games");
    }
    public void buyBabyDiaper(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bestSeller.click();
        babyProduct.click();
        diapering.click();
    }
    public void buyCreamAndOintments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buyBabyDiaper();
        rashCream.click();
        addToCart.click();
        proceedToCheckOut.click();
    }
    public void giftCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bestSeller.click();
        clickOnGiftCards.click();
        birthdayCard.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon Best Sellers: Best Birthday");
    }
    public void primeMember(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        prime.click();
        primeSignUp.click();
    }
    public void departments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchDropDown.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }













}
