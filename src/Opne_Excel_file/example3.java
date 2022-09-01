package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day50-Excel 2\\Sheet2.xlsx");
		
		int LastRow = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(LastRow);
	}

}
