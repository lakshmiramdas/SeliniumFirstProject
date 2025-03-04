package seleniumProgram1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends BaseClass {
	
	public void multipleCheckBoxClick()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> mutiClick=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement listCheckBox:mutiClick)
		{
			listCheckBox.click();
		}
	}

	public static void main(String[] args) {
		FindElementsExample find=new FindElementsExample();
		find.browserInitialization();
		find.multipleCheckBoxClick();
		// TODO Auto-generated method stub

	}

}
