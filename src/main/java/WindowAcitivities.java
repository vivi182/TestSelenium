import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAcitivities {

    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\voudova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com"); // ceka az se to naloaduje uplne
        driver.navigate().to("htpp://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
