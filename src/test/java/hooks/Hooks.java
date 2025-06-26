package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;
import utils.BrowserFactory;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {

        if (BaseClass.driver == null) {
            System.out.println("Launching browser from @Before hook...");
            BaseClass.driver = BrowserFactory.getDriver();
            //WebDriverManager.chromedriver().setup();
            //BaseClass.driver = new ChromeDriver();
            //BaseClass.driver.manage().window().maximize();
        }
    }

    @After
    public void tearDown() {
        System.out.println("Closing browser from @After hook...");
        if (BaseClass.driver != null) {
            BaseClass.driver.quit();
            BaseClass.driver = null;
        }
    }
}
