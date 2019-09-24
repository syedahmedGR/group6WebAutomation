package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void test1(){
        clickOnElement(".nav-linksstyles__NavLinkList-sc-1tike8v-2.jJWZwe li:nth-child(4)");
    }
}
