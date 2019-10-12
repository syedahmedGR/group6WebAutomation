package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class TestHome extends CommonAPI {

     HomePage homePage;  //import HomePage
    // this.driver.navigate().to(this homepageurl)
    @Test
    public void initialize(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void verifyGetHomePageTitle(){
        String title = homePage.getFBTitle();
        Assert.assertEquals(title,"Facebook - Log In or Sign Up");
    }
    @Test(priority = 1)
    public void verifyIsFBHomePageEmailDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePageEmailDisplayed());
    }

    @Test(priority = 2)
    public void verifyIsFBHomePagePasswordDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePagePasswordDisplayed());
    }

    @Test(priority = 3)
    public void verifyIsFBHomePageForgotAccountDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePageForgotAccountDisplayed());
    }
    @Test(priority = 4)
    public void verifyIsFBHomePageSignUPDisplayed() throws Exception {
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        Assert.assertTrue( homePage.isFBHomePageSignUpDisplayed());
    }

    @Test
    public void testLogIn(){
        clickOnElement("email");
        typeOnElement("#email", "user123@gmail.com");
    }
    @Test
    public void handleDropDown()throws InterruptedException{
        //typeOnElement("Month","May");
        driver.findElement(By.id("month")).sendKeys("Sep");
        Thread.sleep(3000);
        //typeOnElement("Day","5");
        driver.findElement((By.id("day"))).sendKeys("28");
        Thread.sleep(3000);
        //typeOnElement("Year","1948");
        driver.findElement(By.id("year")).sendKeys("2019");
    }
    @Test
    public void testSignUpLink(){
        clickOnElement("//*[@id=\"js_0\"]/ul/li[1]/a");
    }
    @Test
    public void testEnglisUshLink(){
        clickOnElement("//*[@id=\"pageFooter\"]/ul/li[1]");
    }
    @Test
    public void testEspanolLink(){
        clickOnElement("//*[@id=\"pageFooter\"]/ul/li[2]/a");
    }
}
