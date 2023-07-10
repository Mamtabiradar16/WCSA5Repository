package PopUp2;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Pupup1alert {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/html22.html");
		//to generate pop up by using on button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		//first way//handle pop up by using robot class
		//Robot robot = new Robot();
		
		
		
		//second way//handle alter pop up
		Alert al = driver.switchTo().alert();

		 al.accept();
		//al.dismiss();
		//System.out.println(al.getText());
		
	}

}
