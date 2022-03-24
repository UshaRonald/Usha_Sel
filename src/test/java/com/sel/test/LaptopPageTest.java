/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author gerau
 */
public class LaptopPageTest {
    
    public LaptopPageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
              public void testLaptopPage() throws Exception {
              WebDriverManager.chromedriver().setup();
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
              driver.get("https://www.advantageonlineshopping.com/");
              driver.findElement(By.id("laptopsTxt")).click();
              driver.findElement(By.name("buy_now")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[2]")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[3]")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[4]")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]/span[5]")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div[2]")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
              driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MEMORY'])[1]/following::label[1]")).click();
              driver.findElement(By.name("save_to_cart")).click();
              
              }
}
