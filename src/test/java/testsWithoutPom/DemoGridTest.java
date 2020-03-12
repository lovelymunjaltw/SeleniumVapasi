package testsWithoutPom;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class DemoGridTest {

    public static void main (String [] args){

        // we can use @Test also instead of main method (if you want to execute by testng xml)
        // follow all the instructions shared in doc: "Set up for Selenium Grid" or follow README.md file in project

        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("http://10.133.124.177:4444/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
        driver.get("https://spree-vapasi.herokuapp.com");
        System.out.println("this is test");
        // can add any assertion here
    }
}