import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void testRegistration() {
        app.goTo().registerPage();

    }
}