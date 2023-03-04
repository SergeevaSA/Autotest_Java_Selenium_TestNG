package src.test.Base;

import Common.CommonAction;
import Pages_pageobject.Base.BasePage;
import Pages_pageobject.Listing.RealListingPage;
import Pages_pageobject.RealtHome.RealtHomePages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import java.util.*;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePages realtHomePages = new RealtHomePages(driver);
    protected RealListingPage realListingPage = new RealListingPage(driver);

    protected void switchWindow () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String window1 = driver.getWindowHandle();
        js.executeScript("window.open()");
        Set<String> currentWindow = driver.getWindowHandles();
        String window2=null;

        for (String window: currentWindow) {
            if (!window.equals(window1)){
                window2=window;
                break;
            }
        }
    driver.switchTo().window(window2);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    protected void workWithWindow () {
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    driver.switchTo().alert();
    alert.accept();
    }
    @AfterSuite (alwaysRun = true)
    public void qute () {
        driver.quit(); //close закрывает одну вкладку
    }
}
