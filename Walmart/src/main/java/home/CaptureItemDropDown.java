package home;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
public class CaptureItemDropDown extends CommonAPI{

    public void dropDown(){
        List<WebElement> element = getListOfWebElementsByXpath("//button[@id='global-search-dropdown-toggle']//span[@class='f_b']");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}
