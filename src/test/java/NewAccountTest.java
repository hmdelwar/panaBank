import Pages.Homepage;
import Pages.RegisterPage;
import Pages.WelcomePage;
import browser.Browser;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewAccountTest {
    @Test
    public void newAccount(){
        Browser browser = new Browser();
        browser.startBrowser().registerLink();
        PageFactory.initElements(Browser.getDriver(), RegisterPage.class)
                .pageFillout();
        //Assert.assertTrue();
        PageFactory.initElements(Browser.getDriver(), WelcomePage.class)
                .createAccount();
        PageFactory.initElements(Browser.getDriver(), Homepage.class)
                .loginLink();
        PageFactory.initElements(Browser.getDriver(), WelcomePage.class)
                .validateAccount();
    }

    public void loginTest(){

    }
}
