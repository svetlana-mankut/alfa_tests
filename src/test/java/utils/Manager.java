package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/**
 * Created by s.mankut on 03.03.2017.
 */
public class Manager {
    WebDriver driver;

    private String browser;
    private Helper helper;

    public Manager(String browser) {
        this.browser = browser;
    }


    public void init() throws IOException {
        if (browser == BrowserType.FIREFOX) {
            driver = new FirefoxDriver();
        } else if (browser == BrowserType.CHROME) {
            driver = new ChromeDriver();
        } else if (browser == BrowserType.IE) {
            driver = new InternetExplorerDriver();
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "none");
        driver.manage().window().maximize();
        helper = new Helper(driver);
    }

    public Helper getHelper() {
        return helper;
    }

    public void stop() {
        driver.quit();
    }
}
