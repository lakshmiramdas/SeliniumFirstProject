package seleniumProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locaters extends BaseClass{
	
	public void idLocator()
	{
		WebElement messageField=driver.findElement(By.id("single-input-field"));
		WebElement showButton=driver.findElement(By.id("button-one"));
		WebElement EnterValueField=driver.findElement(By.id("value-a"));
		WebElement GetTotalField=driver.findElement(By.id("button-two"));
	}
	
	public void nameLocator()
	{
		WebElement nameField=driver.findElement(By.name("viewport"));
		WebElement nameAField=driver.findElement(By.name("keywords"));
		WebElement nameBField=driver.findElement(By.name("description"));
		WebElement nameCField=driver.findElement(By.name("author"));
	}
	public void classLocator()
	{
		WebElement classField=driver.findElement(By.className("navbar-brand"));
		WebElement classField1=driver.findElement(By.className("container page"));
		WebElement classField2=driver.findElement(By.className("list-group list-group-flush"));
		WebElement classField3=driver.findElement(By.className("mb-sec"));
	}
	
	public void linkLocator()
	{
		WebElement linkFieldA=driver.findElement(By.linkText("check-box-demo.php"));
		WebElement linkFieldB=driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement linkFieldC=driver.findElement(By.linkText("select-input.php"));
		WebElement linkFieldD=driver.findElement(By.linkText("ajax-form-submit.php"));
	}
	
	public void partialLinkLocator()
	{
		WebElement partialALinkField=driver.findElement(By.partialLinkText("check-box"));
		WebElement partialBLinkField=driver.findElement(By.partialLinkText("radio-button"));
		WebElement partialDLinkField=driver.findElement(By.partialLinkText("ajax-form"));
		WebElement partialCLinkField=driver.findElement(By.partialLinkText("select-"));
				
	}
	
	public void cssSelecterExample()
	{
		WebElement tagID=driver.findElement(By.cssSelector("button#button-two"));
		WebElement tagId1=driver.findElement(By.cssSelector("input#single-input-field"));
		
		WebElement tagClass=driver.findElement(By.cssSelector("ul.navbar-nav"));
		WebElement tagClass1=driver.findElement(By.cssSelector("button.navbar-toggler"));
		
		WebElement tagAttri=driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement tagAttri1=driver.findElement(By.cssSelector("button[class=navbar-toggler"));
		
		WebElement tagClaAtri=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		WebElement tagClaAtri1=driver.findElement(By.cssSelector("button.navbar-toggler[class=navbar-toggler]"));
	}
	
	public void absolutexpathExample()
	{
		WebElement xpathAbsolute=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement AbsoluXpath=driver.findElement(By.cssSelector("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[2]"));
	}
	public void relativeXPathExample()
	{
		WebElement relaXpathExa=driver.findElement(By.xpath("//input[@placeholder='Message']"));
		WebElement relativeXpath=driver.findElement(By.xpath("//div[@id='message-one']"));
		
		WebElement DynaContain=driver.findElement(By.xpath("//input[contains(@placeholder,'Message')]"));
		WebElement	DynaContain1=driver.findElement(By.linkText("//div[contains(@id,'message-one')]"));
		
		WebElement xpathText=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement dynatext=driver.findElement(By.linkText("//button[text()='Get Total']"));
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
