package homepage;

import common.CommonAPI;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void testLogIn(){
        clickOnElement("email");
        typeOnElement("#email", "user123@gmail.com");
    }


}
