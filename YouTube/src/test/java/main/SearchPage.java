package main;

import common.CommonAPI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;
import utility.DataSource;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

public class SearchPage extends CommonAPI {

    @FindBy(xpath = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/ytd-searchbox/form/div/div[1]/input")
    WebElement searchInput;

    public WebElement getSearchInput(){return searchInput;}
    private Random rand = new Random();

    public void searchInputFromKeyDriven(String input){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String extract;
        try {
            extract = input.substring(input.indexOf(":")+2);
            getSearchInput().sendKeys(extract, Keys.ENTER);
            sleepFor(5);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void searchRandomInput(){
        String extract, vindicate;
        String [] search = DataSource.randomSearch;
        int choice = rand.nextInt(search.length);
        try {
            getSearchInput().sendKeys(search[choice], Keys.ENTER);
            sleepFor(5);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        extract = driver.getCurrentUrl().toString();
        vindicate = extract.substring(extract.indexOf("=")+1).replace("+", " ");
        Assert.assertEquals(search[choice], vindicate);
    }

    public void searchItemFromStaticList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String extract, vindicate;
        boolean verified = true;
        List<String> list = DataSource.getItemValue();
        try {
            int i=0, n = list.size();
            while(i<n){
                getSearchInput().sendKeys(list.get(i), Keys.ENTER);
                sleepFor(5);
                extract = driver.getCurrentUrl().toString();
                vindicate = extract.substring(extract.indexOf("=")+1).replace("+", " ");
                if(!vindicate.equalsIgnoreCase(list.get(i))) {
                    verified = false;
                    break;
                } else {
                    getSearchInput().clear();
                    i++;
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(verified);
    }

    public void searchItemsFromExcelFile() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String extract, vindicate;
        boolean verified = true;
        try {
            List<String> list = DataSource.getItemsListFromExcel();
            getSearchInput().sendKeys(list.get(1), Keys.ENTER);

            extract = driver.getCurrentUrl().toString();
            vindicate = extract.substring(extract.indexOf("=")+1).replace("+", " ");
            if(!vindicate.equalsIgnoreCase(list.get(1))) verified = false;

            getSearchInput().clear();
            for (int i = 2; i < list.size(); i++) {
                getSearchInput().sendKeys(list.get(i), Keys.ENTER);
                sleepFor(5);
                extract = driver.getCurrentUrl().toString();
                vindicate = extract.substring(extract.indexOf("=")+1).replace("+", " ");
                if(!vindicate.equalsIgnoreCase(list.get(i))) {
                    verified = false;
                    break;
                } else {
                    getSearchInput().clear();
                    i++;
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        Assert.assertTrue(verified);
    }

}