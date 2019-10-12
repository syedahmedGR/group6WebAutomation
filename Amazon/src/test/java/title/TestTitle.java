package title;

import common.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestTitle extends CommonAPI {
    @Test
    public void test1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
    }


}
