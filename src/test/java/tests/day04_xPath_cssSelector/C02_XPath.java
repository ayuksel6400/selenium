package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath {
    public static void main(String[] args) throws InterruptedException {
    //   1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //   2- Add Element butonuna basin
    //   3- Delete butonu’nun gorunur oldugunu test edin
    //   4- Delete tusuna basin
    //   5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        Thread.sleep(3000);
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@*='deleteElement()']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu testi PASSED");
        }else {
            System.out.println("Delete butonu testi FAILED");
        }
        Thread.sleep(3000);
        deleteButonu.click();
        Thread.sleep(3000);
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h3"));
        if ( addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add Remove Yazi testi PASSED");
        }else{
            System.out.println("Add Remove Testi FAILED");
        }







    Thread.sleep(3000);
        driver.close();


    }
}
