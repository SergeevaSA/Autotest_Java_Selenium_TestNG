package Pages_pageobject.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Common.Config.implicit_wait_visability;

public class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver=driver;
    }
    public void open (String url) {
        driver.get(url);
    }
    public WebElement waitElementIsVisible (WebElement element) {
        new WebDriverWait(driver, implicit_wait_visability)
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
