package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
     /*
     . .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver.exet i tanitalim
3-Driver'in tum ekranı kaplamasini saglayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
    Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de" adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/" adresine gidip
9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
     public static void main(String[] args) throws InterruptedException {

         // 1-Driver oluşturalim
         System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
         // 2-Java class'imiza chnomedriver.exet i tanitalim
         WebDriver driver = new ChromeDriver();
         // 3-Driver'in tum ekranı kaplamasini saglayalim
         driver.manage().window().maximize();
         // 4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
         // Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         // 5-"https://www.otto.de" adresine gidelim
         driver.get("https://www.otto.de");
         // 6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
         String actualTitle = driver.getTitle();
         String actualUrl = driver.getCurrentUrl();
         // 7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
         String expectedUrl = "OTTO";
         String expectedTitle = "OTTO";


         if (actualTitle.contains(expectedTitle)){
             System.out.println("Url OTTO içeriyor. Test PASSED");
         }else {
             System.out.println("Url OTTO içermiyor. Test FAILED");
         }

         if (actualUrl.contains(expectedUrl)){
             System.out.println("Title OTTO içeriyor. Test PASSED");
         }else {
             System.out.println("Title OTTO içermiyor. Test FAILED");
         }
         // 8-Ardindan "https://wisequarter.com/" adresine gidip
         driver.get("https://wisequarter.com/");
         // 9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
         String actualWQTitle = driver.getTitle();
         String expectedWQTitle = "Quarter";
         if (actualTitle.contains(expectedWQTitle)){
             System.out.println("WiseQuarter Title Testi PASSED");
         } else {
             System.out.println("WiseQuarter Title Testi FAILED");
         }

         //10-Bir onceki web sayfamiza geri donelim
         driver.navigate().back();

         //11-Sayfayı yenileyelim
         driver.navigate().refresh();
         //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
         driver.navigate().back();

         //13- En son adim olarak butun sayfalarimizi kapatmis olalim

         Thread.sleep(3000);
         driver.close();




     }











}
