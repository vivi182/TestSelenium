import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] arg) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\voudova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // dynamic dropdowns
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        //Vybere mesto
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000);

        // pak vybere z toho vyberu dalsi ktere je stejne jako v prvni variante
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        // jina forma bez indexu jak udelat stejny test
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

    }
}
