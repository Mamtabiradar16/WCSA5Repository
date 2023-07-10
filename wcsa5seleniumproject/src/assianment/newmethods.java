package assianment; // to create a exceptoin 

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newmethods
{

	

	public static void main(String[] args) throws InterruptedException  
	{
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/menu.html");
		//identify dropdown on web page
		WebElement dropdwon = driver.findElement(By.id("menu"));
		
		// handle the dropdown by creating object of select class
		Select sal = new Select(dropdwon);
		
		//select multiple option from  dropdown
		for(int i=2;i<=5;i++)
		{
			Thread.sleep(2000);
			sal.selectByIndex(i);// form single dropDown	
		}
		// to read all selected options from dropdown 
		List<WebElement> allopns = sal.getAllSelectedOptions();
				
		// to read the list of webelemnet we use loop
		/*for(WebElement op:allopns)
		{
		   System.out.println(op);
			
		}*/
		
		for(int i=0;i<allopns.size();i++) {
			Thread.sleep(2000);
			System.out.println( allopns.get(i).getText()); 
			
			
		}
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		