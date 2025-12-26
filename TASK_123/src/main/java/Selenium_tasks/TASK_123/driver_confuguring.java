package Selenium_tasks.TASK_123;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driver_confuguring {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\TASK_123\\WEB_DRIVERS\\chromedriver.exe");
		new ChromeDriver();
	

	
		System.setProperty("webdriver.edge.driver","D:\\eclipse\\TASK_123\\WEB_DRIVERS\\msedgedriver.exe");
		new EdgeDriver();
		
		
		
	}
	
}
