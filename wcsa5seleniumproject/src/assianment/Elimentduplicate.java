package assianment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Elimentduplicate {

	public static void main(String[] args) {
		// By using HashSet
		System.setProperty("webdriver.Chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/menu.html");
		
		// identify dropdown 
		WebElement dropdown = driver.findElement(By.id("menu"));
		// handle dropdown
		Select sal = new Select( dropdown);
		HashSet hs = new HashSet<String>();
		
		// to get options from dropdown
		List<WebElement> opns = sal.getOptions();
		
		// to read optionsb from dropdown
		for(int i=0;i< opns.size();i++) 
		{
			WebElement op =  opns.get(i);
			
			//get text of webselement and add info set
			String st= op.getText();
		}
		
		
		

	}

}
