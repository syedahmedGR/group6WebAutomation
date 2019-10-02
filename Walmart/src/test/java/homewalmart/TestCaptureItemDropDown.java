package homewalmart;
import home.CaptureItemDropDown;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCaptureItemDropDown extends CaptureItemDropDown {
    @Test
    public void dropDownData(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dropDown();
    }
}
