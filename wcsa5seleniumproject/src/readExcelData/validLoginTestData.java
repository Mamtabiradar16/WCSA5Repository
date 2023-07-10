package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginTestData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://laptop-i4em60b9/login.do");
	    
	    //read the data from Excel file and test the login page
	    
	   FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sheet = wb.getSheet("Validcreds");
	   Row row = sheet.getRow(1);
	   Cell cell = row.getCell(0);
	   String validUsername = cell.getStringCellValue();
	   
	   FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
	   Workbook wb2 = WorkbookFactory.create(fis2);
	   Sheet sheet2 = wb.getSheet("valicreds");
	   Row row2 = sheet.getRow(1);
	   Cell cell2 = row.getCell(1);
	   String validPassword = cell2.getStringCellValue();
	   
	   
	   driver.findElement(By.name("username")).sendKeys(validUsername);
	   Thread.sleep(2000);
	   driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
	
	   
	   
	   
	 

	}

}
