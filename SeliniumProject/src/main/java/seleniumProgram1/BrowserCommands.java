package seleniumProgram1;


public class BrowserCommands extends BaseClass{
	
	public void browserCommands()
	{	
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		BrowserCommands Browser=new BrowserCommands();
		Browser.browserInitialization();
		Browser.browserCommands();
		// TODO Auto-generated method stub

	}

}
