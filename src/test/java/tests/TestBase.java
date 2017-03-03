package tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Manager;

/**
 * Created by s.mankut on 03.03.2017.
 */
public class TestBase {
    public final Manager manager = new Manager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() throws Exception {
        manager.init();
    }

    @AfterSuite
    public void tearDown() {
        manager.stop();
    }
}
