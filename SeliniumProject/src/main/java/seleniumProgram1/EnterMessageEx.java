package seleniumProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EnterMessageEx extends  BaseClass{

	public void verifyCanEnterMessage()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage=driver.findElement(By.id("single-input-field"));
		System.out.println(entermessage.isEnabled());
		entermessage.sendKeys("Hello");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		showMessage.click();
	}
	
	public void verifyTwoInputFields()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	
	}
	public static void main(String[] args) {
		EnterMessageEx inputformpage=new EnterMessageEx();
		inputformpage.browserInitialization();
		inputformpage.verifyCanEnterMessage();
		inputformpage.quitAndclose();
		// TODO Auto-generated method stub

	}

}
