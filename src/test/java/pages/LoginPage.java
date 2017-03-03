package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.TestBase;
import utils.Helper;


/**
 * Created by s.mankut on 03.03.2017.
 */
public class LoginPage extends TestBase {
    private static String login = "//input[@id='login_']";
    private static String password = "//input[@id='password']";
    private static String login_button = "//button[@class='input_btn']";
    private static String page_url = "https://my.alfabank.com.ua/login";
    private static String forgot_password = "//a[@href='/login/forgotPasswordAction']";
    private static String new_user_registration_button = "//a[@class='new_user_link']";

    public void goTo() {
        manager.getHelper().driver.get(page_url);
    }

    public void setLogin(String strLogin) {
        WebElement userEmail = manager.getHelper().SearchElementByXpath(login);
        userEmail.sendKeys(strLogin);
    }

    public void setPassword(String strPass) {
        WebElement userPassword = manager.getHelper().SearchElementByXpath(password);
        userPassword.sendKeys(strPass);
    }

    public void clickLoginButton() {
        WebElement loginButton = manager.getHelper().SearchElementByXpath(login_button);
        loginButton.click();
    }

    public void clickForgotPasswordButton() {
        WebElement forgotPassword = manager.getHelper().SearchElementByXpath(forgot_password);
        forgotPassword.click();
    }

    public void clickRegistrationButton() {
        WebElement registrationButton = manager.getHelper().SearchElementByXpath(new_user_registration_button);
        registrationButton.click();
    }
}