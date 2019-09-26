package page.objects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    public String getHomePageTitle() {
        return driver.getTitle();
    }
}
