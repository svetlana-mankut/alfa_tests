package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

/**
 * Created by s.mankut on 03.03.2017.
 */
public class Helper {
    public WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement SearchElementByXpath(String target) {
        for (int i = 0; i < 50; i++) {
            if (driver.findElements(By.xpath(target)).size() > 0) {
                break;
            }
        }
        return driver.findElement(By.xpath(target));
    }

    public boolean isElementPresent(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}