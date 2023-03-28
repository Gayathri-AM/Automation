package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalLibrary {
	
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browser, String url) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
	
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
					
} else {
	System.out.println("enter valid browser");
}
	
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
}
	public static void type(WebElement element,String data) {
		element.sendKeys(data);
	}
		
	}


