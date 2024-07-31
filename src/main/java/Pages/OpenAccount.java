package Pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenAccount {
    WebDriver driver = Browser.getDriver();

    public void createAccount(){
        driver.findElement(By.linkText("Open New Account")).click();
    }
}