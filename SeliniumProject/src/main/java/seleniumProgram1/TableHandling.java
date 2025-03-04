package seleniumProgram1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends BaseClass{
	
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fullTableRead=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(fullTableRead.getText());
	}
	
	public void selectingARow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement gettingARow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(gettingARow.getText());
	}
	
	public void selectDateFromARow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[3]"));
		System.out.println(selectData.getText());
	}
	
	public void selectColumData() 
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columeData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:columeData)
		{
			System.out.println(element.getText());
		}
	}
	public void	searchElement()
	{	
		String input="Colleen Hurst";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columeData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:columeData)
		{
			if(element.getText().equals(input))
			{
				System.out.println(element.getText());
			}
		}
		
	}

	public static void main(String[] args) {
		TableHandling read=new TableHandling();
		read.browserInitialization();
		read.fullTable();
		System.out.println("*****************");
		read.selectingARow();
		System.out.println("*****************");
		read.selectDateFromARow();
		System.out.println("*****************");
		read.selectColumData();
		System.out.println("*****************");
		read.searchElement();
		// TODO Auto-generated method stub

	}

}
