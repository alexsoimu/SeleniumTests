package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    @Test
    public void successfulRegisterWithAllDetails() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test");

        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("firstname")).sendKeys("Alexandru");
        driver.findElement(By.id("middlename")).sendKeys("A");
        driver.findElement(By.id("lastname")).sendKeys("Soimu");
        driver.findElement(By.name("email")).sendKeys("soimu.alex97@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Selenium");
        driver.findElement(By.name("confirmation")).sendKeys("Selenium");
        driver.findElement(By.className("checkbox")).click();
    }
}