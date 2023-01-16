package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_CurrencyStepDef {
    P03_HomePage homePage=new P03_HomePage();

    @When("User select euro currency")
    public void Select_Euro(){

    WebElement Currency= homePage.CustomerCurrency();
    Select select=new Select(Currency);
    select.selectByVisibleText("Euro");

}

    @Then("Euro symbol is shown on all products in home page")
    public void euro_Symbol() {

        for(int i=0; i<homePage.Prices().size(); i++){

            String Prices_value= homePage.Prices().get(i).getText();
            //System.out.println(value);
            Assert.assertTrue(Prices_value.contains("€"),"wrong error message");

        }

    }
}
