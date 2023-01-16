package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_SearchStepDef {

P03_HomePage homePage =new P03_HomePage();

    @When("user enter {string}")
    public void userEnter(String subName) throws InterruptedException {

        homePage.searchField().sendKeys(subName);
        homePage.searchButton().click();
        Thread.sleep(3000);

    }


    @Then("user navigated to search link with {string}")
    public void userNavigatedToSearchLinkWith(String subName) {

        SoftAssert softAssert = new SoftAssert();
        String currentUrl = Hooks.driver.getCurrentUrl();
        softAssert.assertTrue(currentUrl.contains(subName), "Wrong message result");


    }

    @And("User could find relative products to the product name {string}")
    public void search_result(String Subname) {

        int Count= homePage.Search_Results().size();

        for(int i=0; i <Count; i++){

            String productName = homePage.Search_Results().get(i).getText().toLowerCase();
            System.out.println("Product Name : " + productName);
            Assert.assertTrue(productName.contains(Subname.toLowerCase()),"nothing");

        }
    }
}
