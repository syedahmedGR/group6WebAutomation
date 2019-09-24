package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void test1(){
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
        System.out.println("testing changes through branch");
    }

    @Test
    public void Test2(){
        System.out.println("This this test 2");
    }
}
