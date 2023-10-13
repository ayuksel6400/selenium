package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_locatorsTagName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.Chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Sayfada 147 adet link bulundugunu test edin.
        4- Products linkine tiklayin
        5- special offer yazisinin gorundugunu test edin
        6- Sayfayi kapatin
        automationexercise.com
        Automation Exercise
        This is for automation practice
        */
        driver.get("https://www.automationexercise.com/");

        List < WebElement> linkListesi = driver.findElements(By.tagName("a"));

        int actualLinkSayisi = linkListesi.size();

        int expectedLinkSayisi = 147;

        if (actualLinkSayisi == expectedLinkSayisi){
            System.out.println("Link sayisi testi PASSED");

        } else {
            System.out.println("Link sayisi testi FAILED");


        }
        Thread.sleep(5000);
        driver.close();





    }





}
