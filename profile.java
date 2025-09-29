import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class profile{
    public static void main(String[] args) {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C://st-mini//selenium jar and drivers//chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to Naukri.com login page
        driver.get("https://www.naukri.com");
        // Enter login credentials
        driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("Your Email");
        driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Your Password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait for login to complete
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[normalize-space()='Complete profile']")).click();
        driver.findElement(By.xpath("//h1[normalize-space()='MEHAK BANU']")).click();
        driver.findElement(By.xpath(" //input[@id='jobType']")).click();
        driver.findElement(By.xpath("//li[@title='Job']//div")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys("Coder");
        driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();

        // to add filters
        driver.findElement(By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-bell']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
