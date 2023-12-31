package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // Gift Cards linkine tiklayin
        // driver.findElement(By.linkText("Gift Cards")).click(); // calisti
        // driver.findElement(By.partialLinkText("Gift")).click(); // calisti
        driver.findElement(By.partialLinkText("Gif")).click();

        // linkin bizi Gift Cards sayfasina yonlendirdigini test edin

        // bunun icin Gift Cards sayfasi acildiginda
        // Gift Cards yazisinin gorunur oldugunu test edelim

        WebElement giftCardyaziElementi = driver.findElement(By.className("nav-menu-logo"));

        if (giftCardyaziElementi.isDisplayed()){
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Cards testi FAILED");
        }

        // sayfayi kapatin
        Thread.sleep(5000);
        driver.close();











    }
}
