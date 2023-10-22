package ATA.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<WebDriver>();
    /*
     * We use private and static modifiers so that no one can create a driver class object,
     * instead everyone should call the static getter method.
     */

    private Driver() {
    }

    /**
     * Synchronized makes method thread safe.
     * It ensures that only 1 thread can use it at the time.
     * Thread safety reduces performance but it makes everything safe.
     *
     * @return
     */

    public synchronized static WebDriver getDriver() {
        /*
         * We first check if a webdriver object exists,
         * if not, this method will create it.
         *
         */
        if (driverPool.get() == null) {
            /*
             * We specified the type of browser in the configuration.properties file.
             * And then, we load these information into a Properties class object
             * by initiating a FileInputStream class  object.
             * This is where we will get type of browser by using ConfigurationReader.java class object.
             */
            String browser = ConfigurationReader.getProperty("browser").toLowerCase();
            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setBrowserVersion("116");
                   //WebDriverManager.chromedriver().setup();
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    chromeOptions.addArguments("--disable-cache");
                    chromeOptions.addArguments("--disable-cookies");
                    chromeOptions.addArguments("--incognito");
                    chromeOptions.setExperimentalOption("debuggerAddress", "localhost:9222");
                    driverPool.set(new ChromeDriver(chromeOptions));
                    break;
                case "chromeheadless":
                    //to run chrome without interface (headless mode)
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.setHeadless(true);
                    driverPool.set(new ChromeDriver(options));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--start-maximized");
                    firefoxOptions.addArguments("--remote-allow-origins=*");
                    firefoxOptions.addArguments("--disable-cache");
                    firefoxOptions.addArguments("--disable-cookies");
                    firefoxOptions.addArguments("--incognito");
                    driverPool.set(new FirefoxDriver());
                    break;
                default:
                    throw new RuntimeException("Wrong browser name !");
            }
        }
        return driverPool.get();
    }
    public static void closeDriver() {
        if (driverPool != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}

