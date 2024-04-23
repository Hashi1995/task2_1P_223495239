package sit707_week2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	
	public static void officeworks_registration_page(String url) throws IOException {
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
				passwordElement.sendKeys("20020304@Hg");
				
				WebElement ConfirmPwdElement = driver.findElement(By.id("confirmPassword"));
				System.out.println("Found element: " + ConfirmPwdElement);
				// Send password
				ConfirmPwdElement.sendKeys("20020304@Hg");
				
				
				
				
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
				
				
		WebElement createAccountBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
	    createAccountBtn.click();	
	    
	    sleep(2);
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
	    
	  //screenshot
        
        File screenshotImage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationFilePath = "C:/Users/venur/OneDrive/Documents/Desktop/officeregister_screenshot.png";
        FileUtils.copyFile(screenshotImage, new File(destinationFilePath));
        System.out.println("Screenshot added");
	    
	   
	    
	    
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void amazon_registration_page(String url) throws IOException {
	    // Step 1: Set Chrome driver path
	    System.setProperty("webdriver.chrome.driver", "C:/Users/venur/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");

	    // Step 2: Initialize Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Load the Careers360 registration page
	    driver.get("https://www.amazon.com.au/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2Fgp%2Fcss%2Fhomepage.html%2Fref%3Dnav_bb_ya%2F%3Fie%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=auflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	    // Wait for page to load
	    sleep(2);

	    // Find and fill in registration form fields
	    WebElement firstLastNameElement = driver.findElement(By.id("ap_customer_name"));
	    firstLastNameElement.sendKeys("Hashini Gunathilaka");

	    WebElement emailElement = driver.findElement(By.id("ap_email"));
	    emailElement.sendKeys("hashinigunathilake7@gmail.com");

	    WebElement passwordElement = driver.findElement(By.id("ap_password"));
	    passwordElement.sendKeys("200203@Hg");

	    WebElement passwordConfirmElement = driver.findElement(By.id("ap_password_check"));
	    passwordConfirmElement.sendKeys("200203@Hg");
	    
	     // Submit the registration form
	    WebElement registerButton = driver.findElement(By.id("continue"));
	    registerButton.click();

	    // Wait for registration process to complete
	    sleep(2);
	    
	  //screenshot
        
        File screenshotImage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationFilePath = "C:/Users/venur/OneDrive/Documents/Desktop/amozon_screenshot.png";
        FileUtils.copyFile(screenshotImage, new File(destinationFilePath));
        System.out.println("Screenshot added");

	    // Close the browser
	    driver.quit();
	}

	 
	
	    public static void facebook_registration_page(String url) throws IOException {
	        // Set Chrome driver path
	        System.setProperty("webdriver.chrome.driver", "C:/Users/venur/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");

	        // Initialize Chrome driver
	        WebDriver driver = new ChromeDriver();

	        // Load the Facebook signup page
	        driver.get(url);

	        // Wait for page to load
	        sleep(2);

	        // Find and fill in registration form fields
	        WebElement firstNameElement = driver.findElement(By.name("firstname"));
	        firstNameElement.sendKeys("Himash");

	        WebElement lastNameElement = driver.findElement(By.name("lastname"));
	        lastNameElement.sendKeys("Gunathilaka");

	        WebElement emailElement = driver.findElement(By.name("reg_email__"));
	        emailElement.sendKeys("venura3536462@gmail.com");

	        WebElement passwordElement = driver.findElement(By.name("reg_passwd__"));
	        passwordElement.sendKeys("12345@A");

	       
	        Select birthDaySelect = new Select(driver.findElement(By.id("day")));
	        birthDaySelect.selectByVisibleText("28");

	        Select birthMonthSelect = new Select(driver.findElement(By.id("month")));
	        birthMonthSelect.selectByVisibleText("Sep");

	        Select birthYearSelect = new Select(driver.findElement(By.id("year")));
	        birthYearSelect.selectByVisibleText("1995");

	       
	        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
	        genderRadioButton.click();

	       
	        WebElement signUpButton = driver.findElement(By.name("websubmit"));
	        signUpButton.click();

	        // Wait for registration process to complete
	        sleep(2);

	        //screenshot
	        
	        File screenshotImage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destinationFilePath = "C:/Users/venur/OneDrive/Documents/Desktop/facebook_screenshot.png";
	        FileUtils.copyFile(screenshotImage, new File(destinationFilePath));
	        System.out.println("Screenshot added");
	        
	        // Close the browser
	        driver.quit();
	    }

	}


