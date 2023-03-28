package orgM2p;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.FunctionalLibrary;

public class Debit extends FunctionalLibrary{
	
	public static void main(String[] args) throws InterruptedException {
	
	        launchBrowser("chrome", "https://www.netflix.com/in/");
	        
			maximizeWindow();
			
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebDriverWait w=new WebDriverWait(driver,10);
		
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("joshuavictor99@gmail.com");
			driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Joshua99@");
			driver.findElement(By.xpath("//button[@type ='submit']")).click();
			
			
			WebElement nextBtn1 = driver.findElement(By.xpath("//*[text()='Next']"));
			w.until(ExpectedConditions.visibilityOf(nextBtn1));
			js.executeScript("arguments[0].scrollIntoView(true);",nextBtn1);
			nextBtn1.click();
			
			
			WebElement basic = driver.findElement(By.xpath("//*[text()='Basic']"));
			w.until(ExpectedConditions.visibilityOf(basic));
			
			
			WebElement nextBtn2 = driver.findElement(By.xpath("//*[text()='Next']"));
			w.until(ExpectedConditions.visibilityOf(nextBtn2));
			js.executeScript("arguments[0].scrollIntoView(true);",nextBtn2);
			nextBtn2.click();
			
			System.out.println("Testq");
			

			WebElement one = driver.findElement(By.xpath("//*[contains(text(),'One last')]"));
			w.until(ExpectedConditions.visibilityOf(one));
			
			
			WebElement nextBtn3 = driver.findElement(By.xpath("//*[text()='Next']"));
			w.until(ExpectedConditions.visibilityOf(nextBtn3));
			js.executeScript("arguments[0].scrollIntoView(true);",nextBtn3);
			nextBtn3.click();
			
			driver.findElement(By.id("creditOrDebitCardDisplayStringId")).click();
			
			
			driver.findElement(By.id("id_firstName")).sendKeys("first name");
			driver.findElement(By.id("id_lastName")).sendKeys("last name");
			driver.findElement(By.id("id_creditCardNumber")).sendKeys("id_creditCardNumber");
			driver.findElement(By.id("id_creditCardNumber")).sendKeys("2344 2344 0000 1234");
			driver.findElement(By.id("id_creditExpirationMonth")).sendKeys("0223");
			driver.findElement(By.id("id_creditCardSecurityCode")).sendKeys("244");
			
			
			driver.findElement(By.xpath("//span[text()='I agree.']")).click();
			driver.findElement(By.xpath("//button[text()='Start Membership']")).click();
			}
	
	}
