package seleniumProgram1;

public class NavigationCommamd extends BaseClass {
	
	public void navigationCommand()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommamd Navigation=new NavigationCommamd();
		Navigation.browserInitialization();
		Navigation.navigationCommand();
		// TODO Auto-generated method stub

	}

}
