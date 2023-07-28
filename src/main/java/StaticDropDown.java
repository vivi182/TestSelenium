import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

    public static void main(String[] arg) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\voudova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        //dropdown vyber
        Select dropdown = new Select(staticDropDown);

        //select by index
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //select by visible text
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //select by value
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
}
