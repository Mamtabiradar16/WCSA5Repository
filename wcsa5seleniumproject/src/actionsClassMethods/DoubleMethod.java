package actionsClassMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DoubleMethod {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-i4em60b9/login.do");
		//target = new WebdriverWait(driver,Duration.ofSeconds(30)).until(ExpctedCondidet).titleContains;
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement target=driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(target).perform();
		
       File dest=new File("./Autoitprograms/Demo1.exe");
       String sba= dest.getAbsolutePath();
       Runtime.getRuntime().exec(sba);
    	
    	
		Thread.sleep(2000);
		driver.quit();
		

	}

}
