package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //youtube'a git
        driver.get("https://youtube.com");


        //sayfa basliginin YouTube oldugunu test ediniz
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.equalsIgnoreCase(expectedTitle) ? "Test Passed" : "Test Failed");

        //facebook'a git
        driver.get("https://facebook.com");

        //sayfa url'inin facebook icerdigini test ediniz
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //youtube sayfasina geri donun
        driver.navigate().back();

        //geri dondugunuzu test edin
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //sayfayi kapat
        driver.quit();
    }
}
