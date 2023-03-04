package Pages_pageobject.RealtHome;

import Pages_pageobject.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealtHomePages extends BasePage {

    public RealtHomePages(WebDriver driver) {
        super(driver);
    }
    By countRooms = By.xpath("//select[@id= 'rooms']");
    By optionRooms = By.xpath("//select[@id= 'rooms']/option[@value=2]");
    By findbtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePages enterCountRooms () {
        driver.findElement(countRooms).click();
        driver.findElement(optionRooms).click();
        return this;
    }

    public RealtHomePages clickToFind () {
        driver.findElement(findbtn).click();
        return this;
    }
}

