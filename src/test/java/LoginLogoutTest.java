import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginLogoutTest extends TestBase {

    @Test
    public void testLogout() {
        app.goTo().registerPage();

    }
}