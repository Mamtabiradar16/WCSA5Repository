package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExcelData(String excelPath,String sheetName,int rowc,int cellc) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelPath);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet(sheetName);
        Row row = sheet.getRow(rowc);
        Cell cell = row.getCell(cellc);
        String data = cell.getStringCellValue();
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
	
	
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}

	

}
