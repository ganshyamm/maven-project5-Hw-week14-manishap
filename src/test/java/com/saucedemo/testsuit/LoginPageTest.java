package com.saucedemo.testsuit;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getTextMessage(),expectedMessage,"Invalid text displayed");


    }@Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        int expectedProductNumber = 6;
        Assert.assertEquals(loginPage.getProductsError(),expectedProductNumber,"Invalid data matched");
    }
}