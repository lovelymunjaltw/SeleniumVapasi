package testsWithoutPom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemoAlertTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/lovely.munjal/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void Alert3Test() {
        System.out.println("Testing 3rd Alert");
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        Alert alert = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert.sendKeys("Hello alert");
        // Now we can accept alert, Above text will be visible on same web page under Result
        alert.accept();
        // can put any further assertions
    }
}