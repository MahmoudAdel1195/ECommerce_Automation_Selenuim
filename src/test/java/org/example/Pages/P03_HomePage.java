package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P03_HomePage {
    public WebElement CustomerCurrency() {

        WebElement Customer_Currency = Hooks.driver.findElement(By.id("customerCurrency"));
        return Customer_Currency;
    }

    public List<WebElement> Prices() {

        List<WebElement> Prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return Prices;
    }

    public WebElement searchField() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton() {
        return Hooks.driver.findElement(By.xpath("//button[@type='submit']"));
    }

//    public List<WebElement> Search_list() {
//
//        List<WebElement> Search_list = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
//
//        return Search_list;
public List<WebElement> Search_Results()
{
    By results = By.cssSelector("h2[class=\"product-title\"]");
    return Hooks.driver.findElements(results);
}
    }





