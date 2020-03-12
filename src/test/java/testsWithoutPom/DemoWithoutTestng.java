package testsWithoutPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DemoWithoutTestng {

    //if we dont use testng or any other testing framework then execution will start from main method also
    //in main method, we can call various test methods
    //But without testng we will have mot have any annotations (like @Test, @BeforeMethod) and Assertions.
    public static void main (String[] args) {
        sampleTest1();
    }

    //Test examples:
    public static void sampleTest1 () {
        // write your code here
        System.setProperty("webdriver.chrome.driver" ,  "/Users/lovely.munjal/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // do any assertion (use if/else etc.) and close the browser
        driver.close();
    }
}
