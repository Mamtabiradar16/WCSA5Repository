package assianment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.accessibility.model.AXValueNativeSourceType;
import org.openqa.selenium.support.ui.Select;

public class Methods{

	 public static void main(String[] args) {

		
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///D:/HTML/menu.html");
		
		WebElement multi=driver.findElement(By.id("menu"));
		Select sal = new Select(multi);
		
		// isMultiple method 
	  boolean result=sal.isMultiple();
	  System.out.println(result);
	  
	  
	  //getOptions method 
	  List<WebElement> dropdown=sal.getOptions();
	  
	  for(int i=0;i<dropdown.size();i++) 
	  {	  
		String  options = dropdown.get(i).getText();
		System.out.println(options);
	
	  }	  
	  // by using for each loop
	  List<WebElement> ops= sal.getOptions();
	  for(WebElement we : ops) {
		  String textops = we.getText();
		  System.out.println( textops);
	  }
	  for(int i=2; i<9;i++)
	  {
		  sal.selectByIndex(i);
		  
	  }
	 WebElement firstoption =sal.getFirstSelectedOption();
	 System.out.println(firstoption);
}
}	 
