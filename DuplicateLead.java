package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pugazh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pugazh");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(source);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Manual tester with two years experiance");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Pugazh@gmail.com");
		WebElement source1= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select((source1));
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
        System.out.println("Title" + driver.getTitle());
            
            driver.findElement(By.linkText("Duplicate Lead")).click();
    	    driver.findElement(By.id("createLeadForm_companyName")).clear();
    	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company 1");
    	    driver.findElement(By.id("createLeadForm_firstName")).clear();
    	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pugazh 1");
    	    driver.findElement(By.name("submitButton")).click();
    	    System.out.println("Title  "   + driver.getTitle());
    		
    	}  
		

}
