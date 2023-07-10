package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneChat {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
		Thread.sleep(2000);
		//2 way
		WebElement we = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(we);
		//1 way
		//driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		chatbox.click();
		
		//WebDriverWait we = new WebDriverWait(driver,Duration.ofSeconds(30));
		//we.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon']")));
		//driver.findElement(By.id("chat-icon")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("8888334011");
		driver.findElement(By.id("chat-fc-email")).sendKeys("halkudemamta86@gmail.com");
		driver.findElement(By.id("chat-fc-name")).sendKeys("mamta biradar");
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();

	}

}
