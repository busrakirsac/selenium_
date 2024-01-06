package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        //sayfa basligi
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //basligin amazon icerdigini test et
        if (actualTitle.contains("Amazon")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        Thread.sleep(3000);


        //URL'i yazdir
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        //URL'in "amazon" icerdigini test et
        if (actualUrl.contains("amazon")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //Handle degerini yazdir
        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        //Sayfa HTML kodlarinda "Gateway" kelimesinin oldugunu test et
        String amazonHTML = driver.getPageSource();

        if (amazonHTML.contains("Gateway")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //Sayfayi kapat
        driver.close();
    }
}
