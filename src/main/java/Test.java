import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //неявное ожидание загрузки элементова
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //неявное ожидание загрузки страницы
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        //неявное ожидание ассинхронного запроса

        driver.get("https://google.com");

        By img = By.xpath("//img[@alt='Google']"); //сначала прописываем путь элемента

        WebElement element = driver.findElement(img); //создаем элемент

        element.getAttribute("src"); //получаем информацию о атрибуте из Пропиртиес
        System.out.println(element.getAttribute("src")); //выводим эту информацию в терминале
        element.click(); // кликаем на элемент
        element.sendKeys("Автомобили", Keys.ENTER); //вводим текст и нажимаем интер
        element.sendKeys("C://путь файла", Keys.ENTER); //загружаем файл на сервер
        String text = element.getText(); //заберет текст со страницы между откр. и закр. тегом
        //Keys. - содержит все кнопки, что есть в клавиатуре

    }
}
