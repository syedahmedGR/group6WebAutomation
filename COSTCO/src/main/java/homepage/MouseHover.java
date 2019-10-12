package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import common.CommonAPI;
import reporting.TestLogger;

public class MouseHover extends CommonAPI {
    public void mouseHoverGrocery()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.linkText("Grocery"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(5000);
        WebElement subMenuOption = driver.findElement(By.linkText("Organic"));
        actions.moveToElement(subMenuOption).perform();
        subMenuOption.click();
    }
    public void businessDelivery()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.linkText("Business Delivery"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption = driver.findElement(By.linkText("Beverages"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(2000);
        subMenuOption.click();
    }
    public void shopAllDepartments()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.cssSelector("#navigation-dropdown"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption= driver.findElement(By.linkText("Baby"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(3000);
        subMenuOption.click();
    }
    public void optical()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.linkText("Optical"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption= driver.findElement(By.linkText("Sunglasses"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(3000);
        subMenuOption.click();
    }
    public void pharmacy()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption= driver.findElement(By.linkText("Pharmacy"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption=driver.findElement(By.linkText("Patient Profile"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(3000);
        subMenuOption.click();
    }
    public void services()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption= driver.findElement(By.linkText("Services"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption=driver.findElement(By.linkText("Costco Auto Program"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(3000);
        subMenuOption.click();
    }
    public void photo()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.linkText("Photo"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption=driver.findElement(By.linkText("Prints"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(3000);
        subMenuOption.click();
    }
    public void travel()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.linkText("Travel"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption=driver.findElement(By.linkText("Hotels"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(3000);
        subMenuOption.click();
    }
    public void membership()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.linkText("Membership"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption=driver.findElement(By.linkText("Renew Membership"));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(3000);
        subMenuOption.click();
    }
    public void change()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"delivery-postal-change\"]"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        WebElement subMenuOption=driver.findElement(By.linkText(""));
        actions.moveToElement(subMenuOption).perform();
        Thread.sleep(2000);
        subMenuOption.click();
    }
    public void linkUS()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.id("country-select"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement subMenuOption = driver.findElement(By.linkText("United States"));
        subMenuOption.click();
    }
    public void linkFindWarehouse()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption= driver.findElement(By.id("warehouse-locations-dropdown"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement submenuOption= driver.findElement(By.cssSelector("label[title = 'Food Court']"));
        sleepFor(2);
        submenuOption.click();
        sleepFor(2);
    }
    public void imageMattresses()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[1]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(4);
        WebElement submenuOption= driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[1]/a/span/img"));
        sleepFor(2);
        submenuOption.click();
        sleepFor(4);
    }
    public void imageBathroom()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[2]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
        WebElement submenuOption= driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[2]/a/span/img"));
        sleepFor(2);
        submenuOption.click();
        sleepFor(3);
    }
    public void imageAppliances()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[3]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
        WebElement submenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[3]/a/span/img"));
        sleepFor(2);
        submenuOption.click();
        sleepFor(3);
    }
    public void imageComputers()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[5]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
        WebElement submenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[5]/a/span/img"));
        sleepFor(3);
        submenuOption.click();
        sleepFor(2);
    }
    public void imageOutdoorHeating()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[6]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
        WebElement submenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[6]/a/span/img"));
        sleepFor(3);
        submenuOption.click();
        sleepFor(2);
    }
    public void imageFurnitureEssential()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[7]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(3);
        WebElement submenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[2]/div[7]/a/span/img"));
        sleepFor(3);
        submenuOption.click();
        sleepFor(2);
    }
    public void imageHotTubsAndSpas()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[1]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement subMenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[1]/a/span/img"));
        subMenuOption.click();
        sleepFor(2);
    }
    public void imageNutrition()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[2]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement subMenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[2]/a/span/img"));
        subMenuOption.click();
        sleepFor(2);
    }
    public void imageToys()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[3]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement subMenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[3]/a/span/img"));
        subMenuOption.click();
        sleepFor(2);
    }
    public void imageTvs()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[5]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement subMenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[5]/a/span/img"));
        subMenuOption.click();
        sleepFor(2);
    }
    public void imageBeauty()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[6]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement subMenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[6]/a/span/img"));
        subMenuOption.click();
        sleepFor(2);
    }
    public void imageThisWeeksLooks()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions= new Actions(driver);
        WebElement menuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[7]/a/span/img"));
        actions.moveToElement(menuOption).perform();
        sleepFor(2);
        WebElement subMenuOption=driver.findElement(By.xpath("//*[@id=\"tiles-body-attribute\"]/div[17]/div/div/div[3]/div[7]/a/span/img"));
        subMenuOption.click();
        sleepFor(2);
    }
}
