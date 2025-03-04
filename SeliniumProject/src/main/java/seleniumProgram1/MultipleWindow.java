package seleniumProgram1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	
	public WebDriver driver;
	
	public void browserInitialization() throws AWTException
	{	
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent:"+parent);
		Set<String> multipleWIndow=driver.getWindowHandles();
		String title="";
		for(String childWindow:multipleWIndow)
		{
			if(!childWindow.equals(parent))
			{
			System.out.println("childWindow:"+childWindow);
			driver.switchTo().window(childWindow);
			System.out.println("Title:"+driver.getTitle());
			title=driver.getTitle();
			//System.out.println("New Title: "+title);(this title is iterated and to be compared)
			
			}
			if(title.equals("WebDriver | Login Portal"))
			{	
				Robot robot=new Robot();
				robot.delay(3000);
				WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
				userName.sendKeys("Aravind");
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				
					WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
					firstName.sendKeys("Aishwarya");
			}
		}	
	}

	public static void main(String[] args) throws AWTException {
		MultipleWindow Multi=new MultipleWindow();
		Multi.browserInitialization();
		// TODO Auto-generated method stub

	}

}

