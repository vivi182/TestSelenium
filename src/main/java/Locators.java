import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\voudova\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        //css selector
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        // link Text
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000); // cekani vterinu

        //Xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Valentina");

        //xpath + css selector
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("valentina@something.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
     //   driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("something@something.com"); //nedoporucuje se

        //getting back to the login page
       // driver.findElement();
        //

        // login correct
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        //select checkbox
        driver.findElement(By.id("checkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

    }
}
