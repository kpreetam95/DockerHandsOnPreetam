package page_tests;

import org.testng.annotations.Test;
import page_objects.LoginPageObject;

public class LoginPageTests extends BaseTest
{

    LoginPageObject loginPageObject;

    @Test
    public void userLoginTest()
    {
        loginPageObject = new LoginPageObject(driver);
        loginPageObject.userLogin("standard_user", "secret_sauce");
    }
}
