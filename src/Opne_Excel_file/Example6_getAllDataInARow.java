package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_getAllDataInARow {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day50-Excel 2\\Sheet2.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastcellnumber = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastcellnumber;i++)
		{
			Cell value = sh.getRow(3).getCell(i);
			
			System.out.print(value+" ");
			
		}
		
		
		
		
	}

}
