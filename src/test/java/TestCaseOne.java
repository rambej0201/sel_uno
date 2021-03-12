import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseOne {

    @Test
    public void printString(){
        System.out.println("printing from test case one");
    }

    @Test
    public void testingChrome() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driving_chrome = new ChromeDriver();
        driving_chrome.get("https://www.google.com");
        System.out.println("launched google website");
        System.out.println("waiting for 15 seconds");
        Thread.sleep(15000);
        System.out.println("====== waited for 15 seconds ======");
    }
}
