package com.cybertek.library.pages;

import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {


    @Before
    public void seTupScenario(){
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        System.out.println("******************************");
        System.out.println("Setting up browser with details");
    }

    @After(order = 2)
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Test FAILED");
        }else {
            System.out.println("---Take a screenshot");
            System.out.println("---Closing browser and ");
        }
        System.out.println("******************************");
        Driver.closeDriver();

    }

    @After
    public void takeScreenshotScenario(Scenario scenario) {
        //if my scenario failed
        // go and take screen shot

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        BrowserUtils.wait(3);
        Driver.closeDriver();

    }
    //comment


}
