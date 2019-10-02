package home;

import common.CommonAPI;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class HandlingCookies extends CommonAPI {

    // Input Email id and Password If you are already Register
    @FindBy(xpath = "//button[@id='header-account-toggle']//span[@class='g_a g_h']")
    WebElement homePageAccountWebElement;

    @FindBy(xpath = "//div[text()='Sign In']")
    WebElement signInWebElement;

    @FindBy(id = "email")
    WebElement usernanmeWebElement;

    @FindBy(id = "password")
    WebElement passwordWebElement;

    @FindBy(xpath = "//button[@class='button m-margin-top'][contains(text(),'Sign In')]")
    WebElement buttonSignInWebElement;

    public WebElement getHomePageAccountWebElement(){ return homePageAccountWebElement;}

    public void clickHomePageAccountWebElement(){ homePageAccountWebElement.click(); }
    public void clickSignInWebElement(){signInWebElement.click();}
    public void clickSubmitButton(){buttonSignInWebElement.click();}
    public void typeUserNamePassword(){
        clickHomePageAccountWebElement();
        clickSignInWebElement();
        usernanmeWebElement.sendKeys("farzana.sharminbd@gmail.com");
        passwordWebElement.sendKeys("frzWM2019");
        clickSubmitButton();
    }

    public boolean isHomePageAccountDisplayed() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Thread.sleep(3000);
        return getHomePageAccountWebElement().isDisplayed();
    }

    public void isSignInSuccessful() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeUserNamePassword();
    }

    public void createCookies() throws Exception {
        // create file named Cookies to store Login Information
        isSignInSuccessful();
        File file = new File("../Generic/src/main/java/utility/Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);

            // loop for getting the cookie information
            for (Cookie ck : driver.manage().getCookies()) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
