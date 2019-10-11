package home;

import common.CommonAPI;
import main.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends CommonAPI {

    public HomePage homePage;

    @Test
    public void verifyIsSearchBoxDisplayed() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.verifyYouTubeSearchBox();

    }

    @Test
    public void verifyIsHomePageLogoDisplayed() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.verifyYouTubeLogo();
    }


}
