/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bmund
 */
public class DominosTest {
   private static WebDriver driver;
   private static String baseUrl;
    public DominosTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCart() throws Exception {
    driver.get("https://www.dominos.com/");
    driver.findElement(By.partialLinkText("Order Online")).click();
    driver.findElement(By.id("Carryout")).click();
    driver.findElement(By.xpath("//div[2]/input")).click();
    driver.findElement(By.xpath("//div[2]/input")).click();-
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[2]/input | ]]
    driver.findElement(By.xpath("//div[2]/input")).clear();
    driver.findElement(By.xpath("//div[2]/input")).sendKeys("60148");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//div[2]/a")).click();
    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/header/button")).click();
    driver.findElement(By.xpath("//div[@id='entree-BuildYourOwn']/a/div[2]/p")).click();
    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[7]/aside/section/div/button")).click();
    driver.findElement(By.xpath("//div[@id='stepUpsell']/div/button")).click();
    driver.findElement(By.xpath("//div[@id='js-myOrderPage']/a")).click();
    driver.findElement(By.id("dialogHeader")).click();
    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/header/button")).click();
  }

    @BeforeClass
    public static void setUpClass() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");     
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
     
}
