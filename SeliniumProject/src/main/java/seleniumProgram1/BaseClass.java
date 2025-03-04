package seleniumProgram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;// webdriver is an interface
	
	public void browserInitialization() 
	{	driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		
	}
	
	public void quitAndclose()
	{
		driver.close();//closes only the last page which was opened
		//driver.quit();//will close all the pages which is opened.
	}

	public static void main(String[] args) {
		BaseClass Base=new BaseClass();
		Base.browserInitialization();
		Base.quitAndclose();
		// TODO Auto-generated method stub

	}
	
	
}
