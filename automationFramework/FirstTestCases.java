package automationFramework;

import javax.lang.model.element.Element;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestCases {

	private static String[] input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You will need to download chrome.webdriver.exe or it will not open in chrome
        System.setProperty("webdriver.chrome.driver", "/C:/Program Files/chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		// Open Website in Chrome
		driver.get("http://demoqa.com/registration/");
		
		// Enter First Name
		driver.findElement(By.name("first_name")).sendKeys("Kim");
		
		//Enter Last Name
		driver.findElement(By.name("last_name")).sendKeys("Mayberry");

		//Select Marital Status
		driver.findElement(By.xpath("//input[@value='married']")).click();

		//Select Hobby
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		
		
		//Select Country
		WebElement selectcountry = driver.findElement(By.id("dropdown_7"));
		 selectcountry.sendKeys("United States");
		
		//Select Month
		WebElement selectmonth = driver.findElement(By.id("mm_date_8"));
		 selectmonth.sendKeys("6");
		
		//Select Day
		 Select Day = new Select(driver.findElement(By.id("dd_date_8")));
		 Day.selectByIndex(4);
		 
		//Select Year
		 WebElement selectyear = driver.findElement(By.id("yy_date_8"));
		 selectyear.sendKeys("1975");
		 
		 
		//Enter Phone Number
		driver.findElement(By.name("phone_9")).sendKeys("9122371137");
				
		//Enter Username
		driver.findElement(By.name("username")).sendKeys("cry");
				
		//Enter Email
		driver.findElement(By.name("e_mail")).sendKeys("artbykimanne@gmail.com");
				
		//Enter About Yourself Info
		driver.findElement(By.name("description")).sendKeys("I love Art. I Love to Paint.");
				
		//Enter Password
		driver.findElement(By.id("password_2")).sendKeys("H1th#r3aL1");				
		
		//Enter Confirm Password
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("H1th#r3aL1");		
		
		//Click Submit to submit the form
		driver.findElement(By.name("pie_submit")).click();
	
	
		//Checks the title is correct
		driver.navigate().to("http://demoqa.com/registration/");

		  Assert.assertEquals("Registration | Demoqa", driver.getTitle());	 
		 System.out.print("\n asserttrue2 - > Executed - means assertion is pass");
	
			
		//Check that Last name is entered
		 driver.getPageSource().contains("Mayberry");
		 System.out.print("Mayberry is present in the page");
		  
	
	
	
	}
	

        


      
	
	
	private static void selectByValue(String string) {
		// TODO Auto-generated method stub
		
	}








	private static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void click(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void Select(WebElement findElement) {
		// TODO Auto-generated method stub
		
	}

}
