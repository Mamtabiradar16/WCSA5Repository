package flipclass1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromeExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://laptop-i4em60b9/login.do");
	    
	    Flibclass flib = new Flibclass();
	    String validuser = flib.readExcelData("./data/ActiTimeTestData.xlsx","Validcreds", 1, 0);
    	String validpass = flib.readExcelData("./data/ActiTimeTestData.xlsx","Validcreds", 1, 1);
    	driver.findElement(By.name("username")).sendKeys(validuser);
    	driver.findElement(By.name("pwd")).sendKeys(validpass);
    	driver.findElement(By.linkText("Login")).click();

	}

}
