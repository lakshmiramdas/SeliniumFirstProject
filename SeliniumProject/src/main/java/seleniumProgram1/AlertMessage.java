package seleniumProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertMessage extends BaseClass {
	
	public void alertMessageOKClick()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertmessg=driver.findElement(By.xpath("//button[@type='button']"));
		alertmessg.click();
		driver.switchTo().alert().accept();
	}
	
	public void alertClickCancel()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		click2.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void clickAlertSendKeys()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickandSendKeys=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickandSendKeys.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		AlertMessage alert=new AlertMessage();
		alert.browserInitialization();
		//alert.alertMessageOKClick();
		//alert.alertClickCancel();
		alert.clickAlertSendKeys();
		
		// TODO Auto-generated method stub

	}

}
