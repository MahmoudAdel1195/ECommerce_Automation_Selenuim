package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

        public WebElement loginlink() {
            WebElement log = Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
            return log;
    }
    public WebElement enter_an_email() {
        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public WebElement enter_password() {
        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement loginButton() {
        WebElement button = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return button;
    }

    public WebElement myAccount_Tab() {
        WebElement tab = Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
        return tab;
    }


}
