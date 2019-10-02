package worldpage;

import common.CommonAPI;
import homepage.SnapShot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSnapShotWorldPage extends CommonAPI {

    public SnapShot snapShot;

    @Test(priority = 0)
    public void verifyIsWorldTitleDisplayed() throws Exception {
        this.snapShot = PageFactory.initElements(this.driver, SnapShot.class);
        //takeSnapShot.clickHomePageWorldLink();
        Assert.assertTrue(snapShot.isWorldTitleDisplayed());

    }

    @Test
    public void testScreenShot() throws IOException {
        takeScreenShot();
    }
}
