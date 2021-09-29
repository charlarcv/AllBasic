package Web_Automation;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClassTest {

	public static WebDriver driver;
	
	
	@Test
	public void FisrtTest() {
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Inside test");
	}
	@Test
	public void FisrtTest1() {
		System.out.println("Inside test2");
	}

}
