package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.util.List;

public class HomePage extends CommonAPI {

    public void SearchValue() {

            driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
            driver.findElement(By.xpath ("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
            sleepFor(2);
            driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("khondokerhpadmo@hotmail.com");
            driver.findElement(By.xpath("//input[@id='continue']")).click();
            sleepFor(2);
            driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("oparazita25");
            driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        }



        /*clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "Java Book");
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");

         */




    /*public void clickOnSearchButton()
    {
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        //TestLogger.log("search button clicked");
    }

    public List<WebElement> getAllElementFromList()
    {
        //List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        //return elementList;
        return driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
    }*/



}
