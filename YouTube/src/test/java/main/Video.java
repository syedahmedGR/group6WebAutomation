package main;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Video extends CommonAPI {

    @FindBy(css = "#img.style-scope.yt-img-shadow[src]")
    WebElement imgVideo;

    public WebElement getImgVideo(){ return imgVideo; }

    public void clickVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        try{
            sleepFor(5);
            getImgVideo().click();
            sleepFor(5);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
