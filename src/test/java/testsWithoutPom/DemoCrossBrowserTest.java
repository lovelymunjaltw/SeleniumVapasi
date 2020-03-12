package testsWithoutPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class DemoCrossBrowserTest {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) throws Exception {
        if(browser.equalsIgnoreCase("firefox")) {

            System.out.println("I am firefox"); // line added just for debuging purpose
            System.setProperty("webdriver.gecko.driver", "/Users/lovely.munjal/Downloads/geckodriver");
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("I am chrome");
            System.setProperty("webdriver.chrome.driver", "/Users/lovely.munjal/Downloads/chromedriver");
        }
        driver.get("https://spree-vapasi.herokuapp.com");
    }

    @Test
    public void test1 (){
        driver.get("https://spree-vapasi.herokuapp.com");
        System.out.println("this is test1");
        // we can add any assertions here
    }

    @Test
    public void test2 (){
        driver.get("https://spree-vapasi.herokuapp.com");//
        System.out.println("this is test2");
        // we can add any assertions here
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}