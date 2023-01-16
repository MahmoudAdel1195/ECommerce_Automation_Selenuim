package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {


    public WebElement registerlink() {
        WebElement reg = Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        return reg;
    }
    public WebElement gender() {
        WebElement gen = Hooks.driver.findElement(By.id("gender-male"));
        return gen;
    }
    public WebElement firstname() {

        WebElement first = Hooks.driver.findElement(By.id("FirstName"));
        return first;
    }
    public WebElement lastname() {

        WebElement last = Hooks.driver.findElement(By.id("LastName"));
        return last;
    }
    public WebElement Day_of_birth(){
        WebElement day = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }
    public WebElement Month_of_birth(){
        WebElement month = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }
    public WebElement Year_of_birth(){
        WebElement year = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }
    public WebElement enter_email(){
        WebElement email=Hooks.driver.findElement(By.id("Email"));
        return email;
    }
    public WebElement enter_password(){
        WebElement password=Hooks.driver.findElement(By.id("Password"));
        return password;
    }
    public WebElement confirm_password(){
        WebElement conf_password=Hooks.driver.findElement(By.id("ConfirmPassword"));
        return conf_password;
    }
    public WebElement success_msg(){
        return Hooks.driver.findElement(By.className("result"));
    }
}