import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Register_for_Online_Access 
{
	public String  Registercard(String url)
	{
		String returnvalue="";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		try{	
		/*WebElement uname = driver.findElement(By.id("usernameMasked"));
		System.out.println("uname text field found: "+uname);
		Actions actions = new Actions(driver);
		actions.moveToElement(uname);
		actions.click();
		String username="uat1_bt_2161";
		actions.sendKeys(username);
		actions.build().perform();*/
		//uname.sendKeys("bt_2685");
/*		WebElement pass = driver.findElement(By.id(""));
		System.out.println("password text field found: "+pass);
		String Password="test123";
		pass.sendKeys(Password);*/		
		driver.findElement(By.id("register_acc")).click();
		String cardNumber="4128-0032-9947-3218";
		String cvv="584";
		String month="";
		String day="";
		String year="";
		String ssn="";
		
		WebElement cardnumber = driver.findElement(By.id("cardNumberMasked"));
		Actions actions = new Actions(driver);
		actions.moveToElement(cardnumber);
		actions.click();
		actions.sendKeys(cardNumber);
		actions.build().perform();
		driver.findElement(By.id("usereg-cardInfo-submit")).click();
		
		/*WebElement securityCode = driver.findElement(By.id("securityCode"));
		securityCode.sendKeys(cvv);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select monthdropdown= new Select(Month);
		monthdropdown.selectByVisibleText(month);
		
		WebElement Day = driver.findElement(By.id("day"));
		Select Daydropdown= new Select(Day);
		Daydropdown.selectByVisibleText(day);
		
		WebElement Year = driver.findElement(By.id("year"));
		Year.sendKeys(year);
		
		WebElement SSN = driver.findElement(By.id("ssn"));
		SSN.sendKeys(ssn);
		
		driver.findElement(By.id("usereg-cardInfo-Next")).click();*/
		
		
		
		

		
		}
		catch(Exception ex)
		{
			System.out.println("Exception occur: "+ex);
			driver.close();
			driver.quit();
		}
		return returnvalue;
	}

}
