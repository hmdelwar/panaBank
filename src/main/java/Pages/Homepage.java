package Pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver = Browser.getDriver();

    public void clickLink(){
        driver.findElement(By.linkText("Register")).click();
    }
}
