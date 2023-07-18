import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashtags {


        public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application");
        webDriver driver = new ChromeDriver();
        driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
        WebElement name= driver.findElemet(By.id("name"));
        name.sendKeys("Gowtham");
        WebElement mail = driver.findElement(By.name("email"));
        mail.sendKeys("gowthamanandaraj.003@gmail.com");
        WebElement ph=driver.findElement(By.name("phone"));
        ph.sendKeys("7358899780");
        WebElement brief= driver.findElemet(By.name("description"));
        brief.sendKeys("At present Working as Test Engineer in TATA Consultancy services, Experienced in core JAVA, Selenium, Cucumber framework");
        WebElement submit= driver.findElement(By.xpath("class='btn form-button font-12 font-bold'"));
        submit.click();
    }
    }


D:\ecom.automation\ecom.automation\src\main\java\Hashtags.java