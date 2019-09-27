package homepage;

import common.CommonAPI;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void test1(){
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
        System.out.println("testing changes through branch");
    }
}
