package src.test.SearchAppartments;

import src.test.Base.BaseTest;
import org.testng.annotations.Test;

@Test
public class SearchAppartTest extends BaseTest {
    public void checkIsRedirectListing() {
        basePage.open("https://realt.by/");

        realtHomePages
                .enterCountRooms()
                .clickToFind();
        realListingPage
                .checkCountCard();

        switchWindow ();
    }

}
