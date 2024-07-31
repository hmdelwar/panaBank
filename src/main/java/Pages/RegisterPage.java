package Pages;

import Utils.GlobalVariables;
import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver = Browser.getDriver();

    public void pageFillout(){
        driver.findElement(By.id("customer.firstName")).sendKeys(GlobalVariables.getFname());
        driver.findElement(By.id("customer.lastName")).sendKeys(GlobalVariables.getLname());
        driver.findElement(By.id("customer.address.street")).sendKeys(GlobalVariables.getAddie()[0]);
        driver.findElement(By.id("customer.address.city")).sendKeys(GlobalVariables.getAddie()[1]);
        driver.findElement(By.id("customer.address.state")).sendKeys(GlobalVariables.getSt());
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(GlobalVariables.getZip());
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(GlobalVariables.getNumber());
        driver.findElement(By.id("customer.ssn")).sendKeys(GlobalVariables.getSocial());
        driver.findElement(By.id("customer.username")).sendKeys(GlobalVariables.getUserName());
        driver.findElement(By.id("customer.password")).sendKeys(GlobalVariables.getPassWord());
        driver.findElement(By.id("repeatedPassword")).sendKeys(GlobalVariables.getPassWord());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();
        System.out.println(j);
    }
}
