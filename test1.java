
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.testng.annotations.AfterTest;
// import org.testng.annotations.BeforeTest;
// import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class test1 {
    public static void main(String[] args) throws InterruptedException {


        // Set the path to the chromedriver executable
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rebel\\Downloads\\Selenium_Jars and Drivers\\Drivers\\Chrome_Drivers\\chromedriver.exe");
//  WebDriverManager.chromedriver().setup();
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // open website from URL
        driver.get("http://uitestingplayground.com/sampleapp");
        // maxximize windows
        driver.manage().window().maximize();

        String usernamefield= generateRandomUsername();

// Find the input field and enter the random value
        WebElement inputField = driver.findElement(By.name("UserName"));
        inputField.sendKeys(usernamefield);

WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("pwd");
        // Add a delay of 2000 ms (2 seconds)
        Thread.sleep(2000);


//login
 WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
         // Add a delay of 2000 ms (2 seconds)
        Thread.sleep(2000);
//logout 
WebElement logoutButton = driver.findElement(By.id("login"));
        logoutButton.click();

// Add a delay of 2000 ms (2 seconds)
        Thread.sleep(2000);


        // Close the browser
        driver.quit();
    }
private static String generateRandomUsername() {
        // Generate a random string or number as per your requirement
     
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 8;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}




