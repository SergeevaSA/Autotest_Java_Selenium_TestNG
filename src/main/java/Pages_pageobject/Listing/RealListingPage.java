package Pages_pageobject.Listing;

import Pages_pageobject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RealListingPage extends BasePage {

    public RealListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='listing view-format']//div[@data-mode='3']");
    public RealListingPage checkCountCard() {
        waitElementIsVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard,20);
        return this;
    }

}
