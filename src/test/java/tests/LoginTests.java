package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by s.mankut on 03.03.2017.
 */
public class LoginTests extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    private void assertLoginIsSuccess() {
        loginPage.goTo();
        loginPage.setLogin("");
        loginPage.setPassword("");
        loginPage.clickLoginButton();
        //тут нужна проверка, что логин успешный, но, поскольку у меня нет аккаунта, я не знаю ожидаемого результата
    }

    @Test
    private void assertLoginFailed() {
        loginPage.goTo();
        loginPage.setLogin("");
        loginPage.setPassword("");
        loginPage.clickLoginButton();
        //проверяем, появилось ли сообщение об ошибке
        Assert.assertTrue(manager.getHelper().isElementPresent("//div[@class='error_txt']"));
    }

    @Test
    private void assertForgotPassFormOpen() {
        loginPage.goTo();
        loginPage.clickForgotPasswordButton();
        Assert.assertEquals(manager.getHelper().driver.getCurrentUrl(), "https://my.alfabank.com.ua/login/forgotPasswordAction");
    }

    @Test
    private void assertRegistrationFormOpen() {
        loginPage.goTo();
        loginPage.clickRegistrationButton();
        Assert.assertEquals(manager.getHelper().driver.getCurrentUrl(), "https://my.alfabank.com.ua/login/identify");
    }
}
