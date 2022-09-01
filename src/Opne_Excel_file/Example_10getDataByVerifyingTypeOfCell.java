package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_10getDataByVerifyingTypeOfCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day51-Excle 3\\Sheet3.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	      Cell cellinfo = sh.getRow(0).getCell(2);
	      CellType s1 = cellinfo.getCellType();
	      
	      if(s1==CellType.STRING)
	      {
	    	  String value = cellinfo.getStringCellValue();
	    	  System.out.println(value+" ");
	      }
	      else if(s1==CellType.NUMERIC)
	      {
	    	  String value = cellinfo.getStringCellValue();
	    	  System.out.println(value);
	      }
	      else if(s1==CellType.BOOLEAN)
	      {
	    	  String value = cellinfo.getStringCellValue();
	    	  System.out.println(value);
	      }
	}

}
