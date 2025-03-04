package seleniumProgram1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	
	public WebDriver driver;
	
	public void fileUploading()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='file-submit']"));
		choosefile.click();
		choosefile.sendKeys("C:\\Users\\laksh\\Documents\\JAVA CLASSES\\Eclipse IDE for Java Developers - 2024-09");
	}
	
	public void roboClass() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		upload.click();
		StringSelection stringSelect=new StringSelection("C:\\Users\\laksh\\Documents\\JAVA CLASSES\\Eclipse IDE for Java Developers - 2024-09");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelect, null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);//virtual keys
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws AWTException {
		FileUploadExample file=new FileUploadExample();
		//file.fileUploading();
		file.roboClass();
		// TODO Auto-generated method stub

	}

}
