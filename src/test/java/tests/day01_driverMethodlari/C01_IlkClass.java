package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.com");
    }
}
