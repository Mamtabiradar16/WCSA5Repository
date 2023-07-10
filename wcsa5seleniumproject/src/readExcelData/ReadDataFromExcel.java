package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	   // Read data from IPL sheet....
		
	   // implementation of read  the data from excel
	  
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");// provide the path of the file name
		Workbook wd = WorkbookFactory.create(fis);// make the file for ready to read
		Sheet sheet = wd.getSheet("IPL");// get into the sheet 
		Row row = sheet.getRow(10);// get into a desired row
	    Cell cell = row.getCell(0);//get into the desired cell/column
	    String data = cell.getStringCellValue();
	    System.out.println(data);
		
		
		

	}

}
