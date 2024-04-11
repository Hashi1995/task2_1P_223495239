package sit707_week2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Hashini Gunathilaka
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException{
		// Step 1: Locate chrome driver folder in the local drive.
		 System.setProperty("webdriver.chrome.driver", "C:/Users/venur/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get("https://www.officeworks.com.au/app/identity/create-account");
		
		
		
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Hashini");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		// Find first input field which is lastname
				WebElement lastNameElement = driver.findElement(By.id("lastname"));
				System.out.println("Found element: " + lastNameElement);
				// Send last name
				lastNameElement.sendKeys("Gunathilaka");
				
				WebElement PhoneNumberElement = driver.findElement(By.id("phoneNumber"));
				System.out.println("Found element: " + PhoneNumberElement);
				// Send phoneNumber
				PhoneNumberElement.sendKeys("7163661237");
				
				WebElement emailElement = driver.findElement(By.id("email"));
				System.out.println("Found element: " + emailElement);
				// Send email
				emailElement.sendKeys("hashinigunathilake7@gmail.com");
				
				WebElement passwordElement = driver.findElement(By.id("password"));
				System.out.println("Found element: " + passwordElement);
				// Send password
				passwordElement.sendKeys("123@Abc");
				
				WebElement ConfirmPwdElement = driver.findElement(By.id("confirmPassword"));
				System.out.println("Found element: " + ConfirmPwdElement);
				// Send password
				ConfirmPwdElement.sendKeys("123@Abc");
				
				
				
				
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
				
		WebElement createAccountBtn = driver.findElement(By.id("account-action-btn"));
	    createAccountBtn.click();	
	    
	    sleep(2);
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    com.google.common.io.Files.copy(screenshotFile, new File(".//screenshot/screen.png"));
	    
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
