import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//TestNG is one of the testing framework

public class UpdatedDropDown {

    public static void main(String[] arg) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // kdyz je to nepravda tak tenhle test projde
       // Assert.assertTrue();
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();

        // count all the checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


        //checkbox
        driver.findElement(By.id("divpaxinfo")).click();
            Thread.sleep(2000);

        // Kontrolouje jestli je tam jenom jeden dospely
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
       // System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for(int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        //Kontroluje jestli je tam 5 dospelych
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

    }
}
