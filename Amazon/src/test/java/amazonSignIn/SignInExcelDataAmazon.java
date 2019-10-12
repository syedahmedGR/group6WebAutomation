package amazonSignIn;
import org.testng.annotations.Test;
import utilities.DataDriven;
import java.io.IOException;

public class SignInExcelDataAmazon extends DataDriven {


        @Test
        public void excelWork() throws IOException, InterruptedException {
            excelData();
        }
}
