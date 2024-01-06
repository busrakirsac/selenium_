package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class C02 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //google'a git
        driver.get("https://google.com");

        //Arama kutusunu "name" attribute e göre bularak "selenium" yazalim
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium", Keys.ENTER);

        //basligin "selenium" icerdigini test edin
        String actualTitle = driver.getTitle();

        if (actualTitle.contains("selenium")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }


        //sayfada kac tane link oldugunu yazdirin
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("links.size() = " + links.size());

        //sayfadaki linklerin metinleri varsa console'a yazdirin
        for (WebElement w : links) {

            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }

        }

        //sayfayi kapat
        driver.quit();


    }
}
