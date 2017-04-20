package automationFramework;

import java.util.List;

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
		
		//Maximize Browser Window
		driver.manage().window().maximize();
		
		// Enter First Name
		driver.findElement(By.name("first_name")).sendKeys("Kim");
		
		//Enter Last Name
		driver.findElement(By.name("last_name")).sendKeys("Mayberry");

		//Select Marital Status
		 //driver.findElement(By.xpath("//input[@value='married']")).click();
     List<WebElement> radiobutton = driver.findElements(By.name("radio_4[]"));
     int iSize = radiobutton.size();
     for(int i=0; i < iSize ; i++ ){
      String sValue = radiobutton.get(i).getAttribute("value");
      	 if (sValue.equalsIgnoreCase("married")){
     		 radiobutton.get(i).click();
      		 break;
      	 }}
      		 //Select Hobby
		//driver.findElement(By.xpath("//input[@value='dance']")).click();
     List<WebElement> checkbox = driver.findElements(By.name("checkbox_5[]"));
     iSize = checkbox.size();
     for(int i=0; i < iSize ; i++ ){
      String sValue = checkbox.get(i).getAttribute("value");
      	 if (sValue.equalsIgnoreCase("cricket ")){
     		 checkbox.get(i).click();
      		 break;
      	 }}
		
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
		driver.findElement(By.name("phone_9")).sendKeys("9122371138");
				
		//Enter Username
		driver.findElement(By.name("username")).sendKeys("yes1245");
				
		//Enter Email
		driver.findElement(By.name("e_mail")).sendKeys("yes21233@gmail.com");
				
		//Enter About Yourself Info
		driver.findElement(By.name("description")).sendKeys("I love Art. I Love to Paint.");
				
		//Enter Password
		driver.findElement(By.id("password_2")).sendKeys("H1th#r3aL1");				
		
		//Enter Confirm Password
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("H1th#r3aL1");		
		
		//Click Submit to submit the form
		driver.findElement(By.name("pie_submit")).click();
		// use this one below to be able to resubmit but you do not get the Thank you or the username or email message
		//driver.findElement(By.name("pie_submit")).submit();
	
		//Check that Last name is entered
        if(driver.getPageSource().contains("Mayberry"))
                System.out.println("Mayberry is Present");
               else
              System.out.println("Mayberry is not Present");
        
        //Check Phone number is correct (I purposely entered the last number incorrectly to check it was working correctly.
        if(driver.getPageSource().contains("9122371137"))
            System.out.println("9122371137 is correct");
           else
          System.out.println("9122371137 is not correct");
		
       if(driver.getPageSource().contains("Thank you for your registration"))
           System.out.println("Thank you for your registration is showing up after submitting form");
           else
           System.out.println("Thank you for your registration is not showing up after submitting form");
      
           
       
      
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
