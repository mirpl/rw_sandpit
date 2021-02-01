package Open_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenOnet {

    @Test
    public void setupPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1400,600");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--single-process");
        options.addArguments("--use-gl=swiftshader");
        options.addArguments("--no-zygote");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.onet.pl");
        driver.quit();
    }
}
