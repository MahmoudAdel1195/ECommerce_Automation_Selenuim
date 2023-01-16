package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {

    P01_Register register=new P01_Register();
    SoftAssert soft = new SoftAssert();

    @Given("user go to register page")
    public void registerpage() {

        //System.out.println("Test On System");
        register.registerlink().click();
    }

    @And("user enter valid data")
    public void valid_data() throws InterruptedException {

        //1-user select gender
        register.gender().click();

        //2-user enter firstname and lastname
        register.firstname().sendKeys("Automation");
        register.lastname().sendKeys("tester");

        //3-user enter date of birth
        Select Day=new Select(register.Day_of_birth());
        Day.selectByIndex(5);
        Thread.sleep(2000);

        Select month=new Select(register.Month_of_birth());
        month.selectByIndex(11);
        Thread.sleep(2000);

        Select year=new Select(register.Year_of_birth());
        year.selectByIndex(83);
        Thread.sleep(2000);


        //4-user enter an email
        register.enter_email().sendKeys("Mtest@gmail.com");

        //5-user enter a password
        register.enter_password().sendKeys("Password@123");
        register.confirm_password().sendKeys("Password@123");
    }

        //user click on register button
        @When("user click on register button")
        public void register_button () {

            Hooks.driver.findElement(By.id("register-button")).click();
        }

        @Then("user could register successfully")
        public void register_successfully() {

            String ExpectedResult = "Your registration completed";
            String Actualresult = register.success_msg().getText();
            String ActualMsgColor= "rgba(76, 177, 124, 1)";
            String ExpectedMsgColor=register.success_msg().getCssValue("color");

            //Assertion

            //soft.assertEquals(Actualresult.contains(ExpectedResult), true);
            soft.assertTrue(Actualresult.contains(ExpectedResult),"success msg assertion fail");
            soft.assertTrue(ActualMsgColor.equals(ExpectedMsgColor),"msg color fail");
           // soft.assertTrue(Hooks.driver.findElement(By.className("result")).isDisplayed());
            soft.assertAll();
        }
    }




