package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		 FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day50-Excel 2\\Sheet2.xlsx");
		
		  String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
		
		 System.out.println(value);
	
		
		
		
		
		
		
		
		
	}

}
