import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    /*аннотация, которая позволяет  из коробки подтянуть пропертя драйвера (преференсиз и т.п.).
      Настройки указываются в serenity.properties filе или в коде
     */
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setupDriver(){
        /*Задаем через библиотеку bonigarcia.wdm.WebDriverManager c каким драйвером будем работать
          Это позволяет загрузить временно бинарник (если его нет уже на машине) и построить к нему путь, тем самым избегая записи
          System.setProperty("webdriver.chrome.driver", "/path/to/binary/chromedriver") */
        WebDriverManager.chromedriver().setup();
    }
}
