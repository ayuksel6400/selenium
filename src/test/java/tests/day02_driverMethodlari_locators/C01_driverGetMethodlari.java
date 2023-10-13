package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdiriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println("Title: "+ driver.getTitle());
        System.out.println("Url: "+ driver.getCurrentUrl());

        System.out.println("Window handle değeri: "+driver.getWindowHandle());
        System.out.println("Window handle değerleri: "+driver.getWindowHandles());


        Thread.sleep(3000);
        driver.close();

    }
}
