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
public class CheckingFilters {
    
    public CheckingFilters() {
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
  public void testCheckingFilters() throws Exception {
              WebDriverManager.chromedriver().setup();
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
              driver.get("https://www.advantageonlineshopping.com/#/category/Laptops/1");
              driver.findElement(By.id("accordionPrice")).click();
              driver.findElement(By.xpath("//div[@id='slider']/div/div[2]/div")).click();
              driver.findElement(By.id("accordionAttrib0")).click();
              driver.findElement(By.id("display_0")).click();
              driver.findElement(By.id("display_1")).click();
              driver.findElement(By.id("display_2")).click();
              driver.findElement(By.id("display_3")).click();
              driver.findElement(By.id("accordionAttrib0")).click();
              driver.findElement(By.id("accordionAttrib1")).click();
              driver.findElement(By.id("operating_system_1")).click();
              driver.findElement(By.id("operating_system_0")).click();
              driver.findElement(By.id("accordionAttrib1")).click();
              driver.findElement(By.id("accordionAttrib2")).click();
              driver.findElement(By.id("processor_0")).click();
              driver.findElement(By.id("processor_1")).click();
              driver.findElement(By.id("processor_2")).click();
              driver.findElement(By.id("processor_3")).click();
              driver.findElement(By.id("processor_4")).click();
              driver.findElement(By.id("accordionAttrib2")).click();
              driver.findElement(By.id("accordionAttrib3")).click();
              driver.findElement(By.id("weight_0")).click();
              driver.findElement(By.id("weight_1")).click();
              driver.findElement(By.id("weight_2")).click();
              driver.findElement(By.id("weight_3")).click();
              driver.findElement(By.id("weight_4")).click();
              driver.findElement(By.id("accordionAttrib3")).click();
              driver.findElement(By.id("accordionColor")).click();
              driver.findElement(By.id("productsColors55CDD5")).click();
              driver.findElement(By.id("accordionColor")).click();
  }

 
}
