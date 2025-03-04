package seleniumProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample extends BaseClass{
	
	public void dragAndDropMethod() 
	{	
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragFrom = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(dragFrom).click();
        actions.doubleClick(dragFrom).perform();
        WebElement dragTo=driver.findElement(By.id("mydropzone"));
        actions.dragAndDrop(dragFrom, dragTo).build().perform();
	}

	public static void main(String[] args) {
		DragAndDropExample drop=new DragAndDropExample();
		drop.browserInitialization();
		drop.dragAndDropMethod();
		
		// TODO Auto-generated method stub

	}

}
