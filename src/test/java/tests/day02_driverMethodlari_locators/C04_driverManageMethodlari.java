package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().setPosition(new Point(200,300));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println("maximaze size"+driver.manage().window().getSize());
        System.out.println("maximaze position"+driver.manage().window().getPosition());
        driver.manage().window().fullscreen();
        System.out.println("fullscreen size"+driver.manage().window().getSize());
        System.out.println("fullscreen position"+driver.manage().window().getPosition());



        Thread.sleep(3000);
        driver.close();
    }
}
