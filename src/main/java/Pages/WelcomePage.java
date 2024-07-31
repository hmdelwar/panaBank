package Pages;

import Utils.GlobalVariables;
import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class WelcomePage {
    WebDriver driver = Browser.getDriver();

    public void createAccount(){
        driver.findElement(By.linkText("Open New Account")).click();
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        GlobalVariables.setAccNumber(driver.findElement(By.xpath("//a[@id='newAccountId']")).getText());
        driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
    }

    public void validateAccount(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String loggedinAcc = driver.findElement(By.cssSelector("table.gradient-style tbody:nth-child(2) tr:nth-child(2) td:nth-child(1) > a:nth-child(1)")).getText();
        Assert.assertTrue(loggedinAcc.equals(GlobalVariables.getAccNumber()), (loggedinAcc+"\n"+GlobalVariables.getAccNumber()));
    }
}
