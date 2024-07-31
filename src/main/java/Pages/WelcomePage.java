package Pages;

import Utils.GlobalVariables;
import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    WebDriver driver = Browser.getDriver();

    public void createAccount(){
        driver.findElement(By.linkText("Open New Account")).click();
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
        GlobalVariables.setAccNumber(driver.findElement(By.xpath("//a[@id='newAccountId']")).getText());
    }
}
