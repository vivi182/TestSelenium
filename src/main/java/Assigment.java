import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

    public static void main (String [] args) {

        // ALERT BUTTON

        String text = "Valentina";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        // CONFIRM BUTTON
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss(); // kdyz chces dat cancel

        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().accept(); // kdyz chces dat OK nebo to proste potvrdit

    }
}
