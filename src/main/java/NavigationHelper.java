
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void registerPage() {
        if (isElementPresent(By.xpath("//div//form"))){
            return;
        }
        click(By.linkText("Регистрация"));
    }
    public void loginPage() {
        if (isElementPresent(By.xpath("//div//form"))
                && isElementPresent(By.name("submit"))){
            return;
        }
        click(By.xpath("//ul/li[3]/a"));
    }





    public By main = By.xpath("//*[@id='dmenu']/option[1]");
    public By ecodes = By.xpath("//option[text()='Коды ошибок']");
    public By currencies = By.xpath("//option[text()='Виды валют']");
    public By materials = By.xpath("//option[text()='ТМЦ']");
    public By viewgrps = By.xpath("//option[text()='Виды отображения данных']");

    public void addNewFeature() {
        click(By.xpath("//div[@class='hta_right']/input[1]"));
    }

    public void main() {
        click(main);
    }


    public void gotoviewgrps() {
        click(viewgrps);
    }
}