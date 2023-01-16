package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void OpenBrowser()  {

        //1-Bridge
       //System.setProperty("webDriver.chrome.driver", "C:\\ProgramFiles\\chromedriver.exe");
        String chromepath= System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe\\";
        System.out.println(chromepath);
        System.setProperty("webdriver.chrome.driver",chromepath);

        //2-create an object from Chrome browser
        driver = new ChromeDriver();

        //3-Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4-Navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


        @After
                public static void QuitDriver() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }




    }


