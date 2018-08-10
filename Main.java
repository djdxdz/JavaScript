import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dk93459\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Register_for_Online_Access register_for_Online_Access = new Register_for_Online_Access ();
		register_for_Online_Access.Registercard("https://sit37.online.citi.com");
	}

}
