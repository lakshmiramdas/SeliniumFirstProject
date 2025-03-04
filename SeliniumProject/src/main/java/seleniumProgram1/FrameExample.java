package seleniumProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	
	public WebDriver driver;
	
	public void displayFrames()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement clickFrame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		clickFrame.click();
	}

	public static void main(String[] args) {
		FrameExample frame=new FrameExample();
		frame.displayFrames();
		// TODO Auto-generated method stub

	}

}
