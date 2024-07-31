package browser;

import Pages.Homepage;
import Utils.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Browser {
    static WebDriver driver;

    public Homepage startBrowser() {
        GlobalVariables.variableDeclaration();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");

        return PageFactory.initElements(driver, Homepage.class);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
