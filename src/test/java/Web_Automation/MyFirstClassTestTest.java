package Web_Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyFirstClassTestTest {
  
	//Initalize webdriver
	public static WebDriver driver;
	
	
	
  @BeforeClass
   public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

  
  //Driver Initialize must user method
  @Test
  public void Test1() {
	  System.setProperty("webdriver.chrome.driver", "/Users/vreddycharla/Documents/Selenium/chromedriver");
	  driver = new ChromeDriver();
	  //driver.get("https://www.google.com/");
	  System.out.println("Google");
	  driver.quit();
	  
  }
  
  //Open Amazon
  //@Test
  public void Test2() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.ae/");
	  System.out.println("Amazon");
	  //Thread.sleep(4000); // Wait until specified time is completed
	
	  //driver.get("https://www.amazon.ae/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Wait till element is found 
	  WebElement best=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
	  best.click();
	  driver.quit();  
	  
  }
  @Test
  public void ExWait() {
	  driver = new ChromeDriver();
	  //Explicit wait
	  driver.get("https://www.amazon.ae/");
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\\\"nav-xshop\\\"]/a[2]")));
	  WebElement best=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));  //locator
	  best.click();
	  
  }
  
  

}


