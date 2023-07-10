package assianment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emailcase3
{
 public static void main(String[] args) 
 {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		driver.findElement(By.xpath("//input[@name='username' and(@type='text')]")).sendKeys("Baswa"); //case3
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
 }

}
