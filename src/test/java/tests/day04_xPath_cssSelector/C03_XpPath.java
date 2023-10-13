package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XpPath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
     // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
     // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
     // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualSayfaTitle = driver.getTitle();
        String expectedTitle = "Spend less";
        if (actualSayfaTitle.contains(expectedTitle)){
            System.out.println("Sayfa basligi testi PASSED");
        } else {
            System.out.println("Sayfa basligi testi FAILED");
        }
     // 6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']  ")).click();
     // 7- Birthday butonuna basin
        driver.findElement(By.linkText("Specialty Gift Cards")).click();
     // 8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//li[@class='a-carousel-card acswidget-carousel__card'])[1]")).click();
     // 9- Gift card details’den 25 $’i secin
     //   driver.findElement(By.id("/div[@id='gc-live-preview-amount-container'")).click();
     // 10-Urun ucretinin 25$ oldugunu test edin
       // WebElement urunFiyatElementi = driver.findElement(By.id("/div[@id='gc-live-preview-amount-container'"));
       // System.out.println(urunFiyatElementi.getText());

     // 11-Sayfayi kapatin
        driver.close();
    }
}
