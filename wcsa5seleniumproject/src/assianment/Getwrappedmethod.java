package assianment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getwrappedmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/menu.html");
		WebElement dropdwon = driver.findElement(By.id("menu"));
		
		Select sal = new Select(dropdwon);
		// to read option from dropdown
		WebElement allop = sal.getWrappedElement();
		System.out.println(allop.getText());
		 
		

	}

}
