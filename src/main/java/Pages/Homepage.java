package Pages;

import Utils.GlobalVariables;
import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver = Browser.getDriver();

    public void registerLink(){
        driver.findElement(By.linkText("Register")).click();
    }

    public void loginLink(){
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]")).sendKeys(GlobalVariables.getUserName());
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]")).sendKeys(GlobalVariables.getPassWord());
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")).click();

    }
}
