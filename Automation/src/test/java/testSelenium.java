import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSelenium {

	public static void main(String args[])
	{
		System.out.println("This is Test");
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\QA Automation\\Selenium\\Drivers\\chromedriver.exe");  
	        
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.javatpoint.com/selenium-maven");
	}
	
	
}
