package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_Hover {

    // locate main category
    public WebElement Computer_Category()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));

    }

    // locate subcategory
    public WebElement Desktop_SubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
    }

    // Locate Desktop Sub-Category Page Title
    public WebElement Desktop_PageTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]> h1"));

    }

    }


