import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

    private NavigationHelper navigationHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    protected void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\IdeaProjects\\test_qa_task\\src\\main\\resources\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Denys\\IdeaProjects\\test_qa_task\\src\\main\\resources\\drivers\\geckodriver.exe");
        if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("");
        }
        driver.get("http://qatesttask.php-cd.attractgroup.com/");
        navigationHelper = new NavigationHelper(driver);

    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    protected void stop() {
        driver.quit();
    }
}