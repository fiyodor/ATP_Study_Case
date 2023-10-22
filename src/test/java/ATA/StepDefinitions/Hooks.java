package ATA.StepDefinitions;

import ATA.Utilities.BrowserUtils;
import ATA.Utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);

    @AfterStep
    public void afterStep(Scenario scenario) {
        // Capture and attach screenshot after each step
        BrowserUtils.getScreenshot(scenario.getName());
    }

    @Before
    public void setup(Scenario scenario) {
        logger.info(":::: Starting test automation ::::");
        //logger.info("Browser type :: {}", ConfigurationReader.getProperty("browser"));
        //logger.info("Environment :: {}", ConfigurationReader.getProperty("url_CMS"));
        //logger.info("Test scenario :: {}", scenario.getName());
        Driver.getDriver().manage().window().maximize();
    }

   @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
            logger.error("Test scenario :: {} :: Failed", scenario.getName());
        } else {
            logger.info("Test scenario :: {} :: Passed", scenario.getName());

        }
        Driver.closeDriver();
    }
}
