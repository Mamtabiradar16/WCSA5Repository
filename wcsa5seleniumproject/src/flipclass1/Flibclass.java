package flipclass1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flibclass {
	
	// to store generic reUsable methods
	// all the method are non static
	
	public String readExcelData(String excelpath,String sheetname,int rowc,int cellc) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);//provide the path of file
		Workbook wb = WorkbookFactory.create(fis);// make the file ready to read
		Sheet sheet = wb.getSheet(sheetname);// get into the sheet
		Row row = sheet.getRow(rowc);//get into desired row 
		Cell cell = row.getCell(cellc);// get into the desired  cell/column
	    String data = cell.getStringCellValue();// read the value frome cell
	    return data;
		
	}
	
	public int getlastRowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
	    return rc;
		
	}
	
	public void writeExelData(String excel,String sheetName,int rowC,int cellc,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excel);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowC);
		Cell cell = row.createCell(cellc);
	    cell.setCellValue(data);
	    
		FileOutputStream fos = new FileOutputStream(excel);
		wb.write(fos);
	}
	
	
	

	public static void main(String[] args) {
		
     
	}

}
