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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[1]/input[1]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/p[2]/a")).click();
        System.out.println(driver.findElement(By.id("accountId")).getText());
        GlobalVariables.setAccNumber(driver.findElement(By.id("accountId")).getText());
        driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
    }

    public void validateAccount(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String loggedinAcc = driver.findElement(By.cssSelector("table.gradient-style tbody:nth-child(2) tr:nth-child(2) td:nth-child(1) > a:nth-child(1)")).getText();
        System.out.println(loggedinAcc);
        System.out.println(GlobalVariables.getAccNumber());
        Assert.assertTrue(loggedinAcc.equals(GlobalVariables.getAccNumber()), (loggedinAcc+"\n"+GlobalVariables.getAccNumber()));
    }

    //*[@id="accountTable"]/tbody/tr[2]/td[1]/a
}
