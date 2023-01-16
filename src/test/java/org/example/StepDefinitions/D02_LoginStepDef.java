package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D02_LoginStepDef {
    P02_Login login=new P02_Login();
    SoftAssert soft = new SoftAssert();

    //1-user select on login button
    @Given("user go to login page")
    public void login_page() {

        login.loginlink().click();
    }

    //2-user enter valid email and password
    @When("user login with valid data")
    public void validData(){

        login.enter_an_email().sendKeys("Mahmoud.adele95@gmail.com");
        login.enter_password().sendKeys("Password@123");
    }

    //3-user press on login button
    @And("user press on login button")
    public void presslogin(){

        login.loginButton().click();
    }

    //4-user login successfully
    @Then("user login to the system successfully")
    public void successlogin(){

        String Url="https://demo.nopcommerce.com/";
        soft.assertEquals(Url , Hooks.driver.getCurrentUrl());
        soft.assertTrue(login.myAccount_Tab().isDisplayed());

    }

    @When("user login with invalid data")
    public void invalidData(){

        login.enter_an_email().sendKeys("test123@gmail.com");
        login.enter_password().sendKeys("Password@123");
    }
    @Then("user could not login to the system successfully")
    public void Could_not_login(){

        WebElement Actual_message=Hooks.driver.findElement
                (By.xpath("//div[@class='message-error validation-summary-errors']"));

        String Expected_message_Text="Login was unsuccessful. Please correct the errors and try again.";
        String Actual_message_text= Actual_message.getText();
        String Actual_message_color=Actual_message.getCssValue("color");
        String Expected_message_color="#e4434b";

        //First Assertion
        soft.assertTrue(Actual_message_text.contains(Expected_message_Text),"Assertion message invalid login");

        //Second Assertion

        //soft.assertEquals(Actual_message_color,Color.fromString(Expected_message_color).asHex(),"Assertion message invalid");
        soft.assertTrue(Color.fromString(Actual_message_color).asHex().equals(Expected_message_color), "Wrong Color Message ");

        soft.assertAll();



    }


    }

