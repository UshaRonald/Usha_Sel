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
public class EditRemoveButtonTest {
    
    public EditRemoveButtonTest() {
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
  public void testEditRemoveButton() throws Exception {
      WebDriverManager.chromedriver().setup();
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
              driver.get("https://www.advantageonlineshopping.com/#/");
              driver.findElement(By.id("speakersTxt")).click();
              driver.findElement(By.linkText("Bose SoundLink Wireless Speaker")).click();
              driver.findElement(By.name("save_to_cart")).click();
              driver.findElement(By.linkText("HOME")).click();
              driver.findElement(By.id("tabletsImg")).click();
              driver.findElement(By.id("18")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
              driver.findElement(By.name("save_to_cart")).click();
              driver.findElement(By.linkText("HOME")).click();
              driver.findElement(By.id("laptopsImg")).click();
              driver.findElement(By.id("5")).click();
              driver.findElement(By.name("save_to_cart")).click();
              driver.findElement(By.linkText("HOME")).click();
              driver.findElement(By.id("miceImg")).click();
              driver.findElement(By.id("32")).click();
              driver.findElement(By.name("save_to_cart")).click();
              driver.findElement(By.linkText("HOME")).click();
              driver.findElement(By.id("menuCart")).click();
              driver.findElement(By.linkText("REMOVE")).click();
              driver.findElement(By.xpath("//div[@id='shoppingCart']/table/tbody/tr[3]/td[6]/span/a")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
              driver.findElement(By.name("save_to_cart")).click();
              driver.findElement(By.linkText("EDIT")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
              driver.findElement(By.id("rabbit")).click();
              driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div")).click();
              driver.findElement(By.name("save_to_cart")).click();
  }
}
