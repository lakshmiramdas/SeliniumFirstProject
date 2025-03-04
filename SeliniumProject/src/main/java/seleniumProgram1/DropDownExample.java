package seleniumProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample extends BaseClass{

	public void dropDownClick()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement clickdrop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select =new Select(clickdrop);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(2);
		select.selectByValue("Green");
	}
	public static void main(String[] args) {
		DropDownExample dropDown=new DropDownExample();
		dropDown.browserInitialization();
		dropDown.dropDownClick();
		
		// TODO Auto-generated method stub

	}

}
