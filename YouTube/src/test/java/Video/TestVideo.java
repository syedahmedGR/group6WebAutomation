package Video;

import common.CommonAPI;
import main.Video;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestVideo extends CommonAPI {

    Video video;

    @Test
    public void clickVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        video = PageFactory.initElements(this.driver, Video.class);
        video.clickVideo();
    }
}
