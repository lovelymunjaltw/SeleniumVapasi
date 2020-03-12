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

        // put any assertion , below one is just for demo purpose how POM and Base class working together
        Assert.assertEquals(1,1);
    }
}