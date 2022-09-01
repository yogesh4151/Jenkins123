package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day49-Open excel file\\Sheet1.xlsx");
		
		//boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
	    //System.out.println(value);
	    
	    int value = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
	    
	    System.out.println(value);
	}

}
