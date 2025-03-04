package seleniumProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo extends BaseClass{

	public void CheckBoxDemoClick()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickCheckBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		System.out.println(clickCheckBox.isSelected());
		clickCheckBox.click();
		System.out.println(clickCheckBox.isSelected());
		
	}
	 public void radioButtonClick()
	 {	
		 driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		 WebElement radioButtonClick=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		 radioButtonClick.click();
	 }
	public static void main(String[] args) {
		CheckBoxDemo demo=new CheckBoxDemo();
		demo.browserInitialization();
		demo.CheckBoxDemoClick();
		demo.radioButtonClick();
		
	
		// TODO Auto-generated method stub

	}

}
