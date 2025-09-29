import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TO OPEN CHROME,MAXIMIZE CHROME WINDOW,NAVIGATE TO NAUKRI APP
        System.setProperty("webdriver.chrome.driver","C://st-mini//selenium jar and drivers//chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.naukri.com");
        driver.get("https://www.naukri.com/nlogin/login");

       //TO TEST LOGIN PAGE OF NAUKRI WEBSITE
        //TEST CASE 1(ENTER WRONG USERNAME OR PASSWORD)
        driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("Your Email");
        driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Your Password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String u = driver.getCurrentUrl();

        if(u.equals("https://www.naukri.com/nlogin/login")) {
            System.out.println("TEST CASE PASSED");
        }
        else {
            System.out.println("TEST CASE FAILED");
        }

        System.out.println(u);


       // driver.findElement(By.xpath("//a[normalize-space()='Complete profile']")).click();
        //driver.findElement(By.xpath("//div[@class='add-missing-btn title-16-bold']")).click();
        driver.close();

    }
}
