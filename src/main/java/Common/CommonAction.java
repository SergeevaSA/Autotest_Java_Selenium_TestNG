package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static Common.Config.implicit_wait;
import static Common.Config.platform_and_browser;

public class CommonAction {
            //Singleton//
    private static WebDriver driver = null;
    private CommonAction () {
    }
    public static WebDriver createDriver () {
        if(driver==null) {
            switch (platform_and_browser) {
                case "win_chrome":
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver=new ChromeDriver();
            break;
                case "win_firefox":
            System.setProperty("webdriver.firefox.driver","src/main/resources/firefoxdriver.exe");
            driver=new FirefoxDriver();
            break;
                case "win_opera":
            System.setProperty("webdriver.opera.driver","src/main/resources/operadriver.exe");
            driver=new OperaDriver();
            break;
                default:
                    Assert.fail("Incorrect Browser or Platform: "+platform_and_browser);
        }
        driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
        }
        return driver;
    }
}
