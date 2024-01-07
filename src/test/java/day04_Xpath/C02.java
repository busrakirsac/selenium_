package day04_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon'a git
        driver.get("https://www.amazon.com");

        Thread.sleep(5000);

        //arama kutusunda "city bike" arat
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("city bike", Keys.ENTER);

        //goruntulenen ilgili sonuclarin sayisini yazdir
        WebElement searchResult = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("searchResult.getText() = " + searchResult.getText());

        //sadece sonuc sayisini yazdirin
        String [] sonucSayisi =  searchResult.getText().split("");
        System.out.println("sonucSayisi[2] = " + sonucSayisi[2]);

        //karsiniza cikan ilk sonucun metnine tiklayin
        driver.findElement(By.xpath("(//h2)[1]")).click();

        //sayfayi kapat
        driver.close();

    }
}
