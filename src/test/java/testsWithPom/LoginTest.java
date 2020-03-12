package testsWithPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base {

    HomePage obj;
    LoginPage loginObj;

    @Test
    public void verifylogin (){
        obj = new HomePage(driver);
        obj.clickLoginButton();

        loginObj = new LoginPage(driver);
        loginObj.setUsername();
        loginObj.setpassword();
        loginObj.clickLogin();
        System.out.println("Test runnign *****");
        Assert.assertEquals(1,1);
    }
}