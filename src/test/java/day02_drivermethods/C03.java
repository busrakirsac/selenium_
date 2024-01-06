package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //youtube'a git
        driver.navigate().to("https://youtube.com");

        //amazon'a git
        Thread.sleep(3000);
        driver.navigate().to("https://amazon.com");

        //youtube'a geri don
        Thread.sleep(3000);
        driver.navigate().back();

        //amazon'a yeniden git
        driver.navigate().forward();
        Thread.sleep(3000);

        //sayfayi yenile
        driver.navigate().refresh();

        //sayfayi kapat
        driver.quit();


    }
}
