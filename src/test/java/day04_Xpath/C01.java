package day04_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //youtube'a git
        driver.get("https://youtube.com");

        //arama kutusunun tag name'inin input oldugunu test ediniz
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        String actualTagName = searchBox.getTagName();
        String expectedName = "input";
        if (actualTagName.equals(expectedName)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");

        }


        //arama kutusunun class attribute degerinin "ytd-searchbox"oldugunu test ediniz
        String actualClass = searchBox.getAttribute("class");
        String expectedClass = "ytd-searchbox";

        if (actualClass.equals(expectedClass)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        Thread.sleep(3000);

        //sayfayi kapatiniz
        driver.quit();

    }
}
