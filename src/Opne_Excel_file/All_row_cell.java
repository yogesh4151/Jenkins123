package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_row_cell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day50-Excel 2\\Sheet2.xlsx");
		
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		 int lastrow = sh.getLastRowNum();
		 for(int i=0;i<=lastrow;i++)
		 {
			int lastcell = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcell;j++)
			{
				 String value = sh.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value+ " ");
			 }

			 System.out.println();
		 }
		 
		 
		
		
	}

}
