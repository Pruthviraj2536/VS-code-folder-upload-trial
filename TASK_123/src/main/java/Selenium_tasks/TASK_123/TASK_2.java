package Selenium_tasks.TASK_123;

public class TASK_2 {

	public static void main(String[] args)
	
	{
		

		Object driver;
		driver.get("https://practicetestautomation.com/logged-in-successfully/");
		
		String expected_URL="https://practicetestautomation.com/logged-in-successfully/";
		
		String Actual_URL=driver.
	
		if( Actual_URL.equals(expected_URL))
		
		{
			System.out.println("URL is matching");
			
		}
		else 
		{
			System.out.println("URL is not matching");
			
		}
	}

}
