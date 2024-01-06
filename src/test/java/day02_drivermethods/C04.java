package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //youtube'a git
         driver.get("https://youtube.com");

         //sayfanin konumu ve boyutlarini yazdir
        System.out.println("Konum = " + driver.manage().window().getPosition());
        System.out.println("Boyut = " + driver.manage().window().getSize());

        //sayfayi simge durumuna getir
        driver.manage().window().minimize();

        Thread.sleep(3000);

        //sayfayi maximize yap
        driver.manage().window().maximize();

        //sayfanin konumu ve boyutlarini yazdir
        System.out.println("Konum = " + driver.manage().window().getPosition());
        System.out.println("Boyut = " + driver.manage().window().getSize());

        //sayfayi fullscreen yap
        driver.manage().window().fullscreen();

        Thread.sleep(3000);

        //sayfanin konumu ve boyutlarini yazdir
        System.out.println("Konum = " + driver.manage().window().getPosition());
        System.out.println("Boyut = " + driver.manage().window().getSize());

        //sayfayi kapat


    }
}
