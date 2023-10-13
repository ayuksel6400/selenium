package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        // sayfa basliginin "smile more" icerdigini test edin
        String expectedTitleIcerik = "smile more";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Amazon title testi PASSED");
            }else {
            System.out.println("Amazon title testi FAILED");
            System.out.println("Beklenen title "+ expectedTitleIcerik+ " içermiyor.");
        }
        // youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);
        // url'in "youtube" icerdigini test edin
        String expectedUrlIcerik = "youtube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube URL testi PASSED");
        }else {
            System.out.println("Youtube URL testi FAILED");
        }

        // tekrar amazon anasayfaya donun
        // ve url'in "ramazon" icermedigini test edin

        driver.navigate().back();
        Thread.sleep(2000);
        String unexpectedUrlIcerik = "ramazon";
        actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(unexpectedUrlIcerik)){
            System.out.println("Amazon url testi FAILED");
            }else {
            System.out.println("Amazon url testi PASSED");

        }

        // tekrar youtube ansayfaya gidin
        // sayfa kaynak kodlarinda "music" gectigini test edin
        driver.navigate().forward();
        Thread.sleep(2000);
        String expectedSayfaIcerik = "music";
        String actualSayfaKaynakKodlari = driver.getPageSource();

        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerik)){
            System.out.println("Youtube Kaynak kodu testi PASSED");
        } else{
            System.out.println("Youtube kaynak kodu testi FAILED");
        }
        Thread.sleep(2000);
        driver.close();



        // sayfayi kapatin





    }
}
