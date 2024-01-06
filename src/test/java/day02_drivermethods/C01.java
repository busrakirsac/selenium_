package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://amazon.com";
        driver.get(url);

        //sayfa basligi
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //sayfa url'i
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        driver.quit();


    }
}
