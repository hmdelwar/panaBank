import Pages.RegisterPage;
import Pages.WelcomePage;
import browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewAccountTest {
    @Test
    public void newAccount(){
        Browser browser = new Browser();
        browser.startBrowser().clickLink();
        PageFactory.initElements(Browser.getDriver(), RegisterPage.class)
                .pageFillout();
        //Assert.assertTrue();
        PageFactory.initElements(Browser.getDriver(), WelcomePage.class)
                .createAccount();

    }
}
