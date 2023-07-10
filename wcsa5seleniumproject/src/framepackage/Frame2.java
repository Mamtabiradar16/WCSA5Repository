package framepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/username.html");
		driver.findElement(By.xpath("//input[@id='i1']")).sendKeys("mamta");
	    WebElement we = driver.findElement(By.xpath("//iframe[@id='frameId']"));
		driver.switchTo().frame(we);
		WebElement target = driver.findElement(By.xpath("//input[@id='i2']"));
		target.sendKeys("1234");

	}

}
