package page_tests;

import org.testng.annotations.Test;
import page_objects.LoginPageObject;
import page_objects.ProductsPageObject;


public class ProductsPageTests extends BaseTest
{
    LoginPageObject loginPageObject;

    ProductsPageObject productsPageObject;

    @Test
    public void testItemName()
    {
        loginPageObject = new LoginPageObject(driver);
        loginPageObject.userLogin("performance_glitch_user", "secret_sauce");
        productsPageObject = new ProductsPageObject(driver); //To check how to implement dependency injection
        System.out.println(productsPageObject.getTitleOfPage());
        System.out.println(productsPageObject.getItemName());

        /*
        //Above code using dependency injection
        //productsPageObject = loginPageObject.userLogin("performance_glitch_user", "secret_sauce");
        loginPageObject = new LoginPageObject(driver);
        productsPageObject = loginPageObject.userLogin("performance_glitch_user", "secret_sauce");
        System.out.println(productsPageObject.getTitleOfPage());
        System.out.println(productsPageObject.getItemName());
         */
    }
}
