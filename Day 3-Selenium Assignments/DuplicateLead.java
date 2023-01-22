package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//opening chrome
		driver.get("http://leaftaps.com/opentaps/control/main");//loading URL
		driver.manage().window().maximize();//Maximize window
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");//entering username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//entering password
		driver.findElement(By.className("decorativeSubmit")).click();//click on submit
		driver.findElement(By.linkText("CRM/SFA")).click();//click on the link
		driver.findElement(By.linkText("Leads")).click();//click on leads
		driver.findElement(By.linkText("Create Lead")).click();//click on create leads
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hatsun");//entering company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sushmitha");//entering firstname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");//entering lastname
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sushmi");//entering first name local
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");//entering company
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Lead");//entering description
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sushmi@gmail.com");//entering gmail
		driver.findElement(By.name("submitButton")).click();//click on create lead
		System.out.println("Page title is : " + driver.getTitle());//getting title
		driver.findElement(By.linkText("Duplicate Lead")).click();//click on duplicate lead
		driver.findElement(By.id("createLeadForm_companyName")).clear();//clearing
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Heritage");//adding new value
		WebElement ele = driver.findElement(By.name("submitButton"));
		String attribute = ele.getAttribute("value");
		System.out.println("Success"+ attribute);
		ele.click();//update
		System.out.println("Page title is : " + driver.getTitle());//getting title
		
		//driver.close();
		
	}	
		
}
