package prueba;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	
	@Test
	public void testMethod()
	
	{	
		WebDriver driver; //Variable global//declaración y creación de instancias de objetos / variables
		System.setProperty ("webdriver.firefox.marionette", "/home/hector/eclipse-workspace/prueba/driver/geckodriver");
		driver = new FirefoxDriver (); //vuelvo a cargar el browser
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
				  			  
	
		driver.close();
	}
	
}
