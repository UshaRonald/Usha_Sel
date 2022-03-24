/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
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
public class ContactPageTest {
    
    public ContactPageTest() {
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
     public void testContactPage() throws Exception {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.advantageonlineshopping.com/");
    driver.findElement(By.linkText("CONTACT US")).click();
    driver.findElement(By.name("categoryListboxContactUs")).click();
    new Select(driver.findElement(By.name("categoryListboxContactUs"))).selectByVisibleText("Laptops");
    driver.findElement(By.name("productListboxContactUs")).click();
    new Select(driver.findElement(By.name("productListboxContactUs"))).selectByVisibleText("HP Pavilion 15t Touch Laptop");
    driver.findElement(By.name("emailContactUs")).click();
    driver.findElement(By.name("emailContactUs")).clear();
    driver.findElement(By.name("emailContactUs")).sendKeys("gerausharani1@gmail.com");
    driver.findElement(By.name("subjectTextareaContactUs")).click();
    driver.findElement(By.name("subjectTextareaContactUs")).clear();
    driver.findElement(By.name("subjectTextareaContactUs")).sendKeys("Hi there, do you have this laptop?");
    driver.findElement(By.id("send_btnundefined")).click();
  
     }
}
