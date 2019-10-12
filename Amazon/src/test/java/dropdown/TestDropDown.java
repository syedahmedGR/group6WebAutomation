package dropdown;

import dropdownmenu.FetchDropDown;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestDropDown extends FetchDropDown {
    @Test
    public void dropDownData(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dropDown();
    }
}
