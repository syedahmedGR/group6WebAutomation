package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void test1(){
        String str = driver.getTitle();
        System.out.println(str);
    }
}
