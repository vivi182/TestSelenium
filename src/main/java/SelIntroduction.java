import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SelIntroduction {


    public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\voudova\\Downloads\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com"); //pripoji se na stranku
        System.out.println(driver.getTitle()); // ziskavas nazev stranky
        System.out.println(driver.getCurrentUrl()); //overujes url
        driver.close(); // zaviras stranku









      //  driver.close();

//driver.quit();


    }
}
