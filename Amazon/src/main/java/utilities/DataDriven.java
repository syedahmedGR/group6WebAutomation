package utilities;

import common.CommonAPI;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven extends CommonAPI {
    public void excelData() throws IOException, InterruptedException {
        ArrayList<String> userName= dataFromExcel(0);
        ArrayList<String> password =dataFromExcel(1);
        for(int i=0;i<userName.size();i++){
            driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(userName.get(i));
            driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#ap_password")).sendKeys(password.get(i));
            driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
            clearInputByXpath("//input[@name='email']");
            clearInputByXpath("//input[@name='pass']");
        }
    }
    private void clearInputByXpath(String s) {
    }
    public ArrayList<String> dataFromExcel(int colNo) throws IOException {
        FileInputStream filein = new FileInputStream("/Users/alamgir/Documents/Automationclone/group6WebAutomation/Amazon/OutSourcrData/AmazonLoginData.xls");
        HSSFWorkbook hss = new HSSFWorkbook(filein);
        HSSFSheet siter = hss.getSheet("Sheet1");
        Iterator<Row> rowIT =siter.iterator();
        ArrayList<String> list = new ArrayList<>();
        while(rowIT.hasNext()){
            list.add(rowIT.next().getCell(colNo).getStringCellValue());
        }
        return list;
    }
}

