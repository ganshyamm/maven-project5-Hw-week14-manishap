package com.saucedemo.pages;

import com.saucedemo.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends UtilityClass {
    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");

    By textMessage = By.xpath("//div/span[text()='Products']");

    By errorProductNumber = By.className("inventory_item");



    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
        
    } public String getTextMessage(){
        return getTextFromElement(textMessage);
    }
    public int getProductsError(){
        List<WebElement> list = driver.findElements(errorProductNumber);
        int actualNumber = list.size();
        return actualNumber;
    }

}




