import org.testng.annotations.DataProvider;

public class DPT {
    @DataProvider
    public Object [][] dataProviderMethod () {
        return new Object[][] {
                {"1", "String"},
                {"2", "String"},
                {"3", "String"}

        };
    }
}

