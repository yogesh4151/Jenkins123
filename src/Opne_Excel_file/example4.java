package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4 {
	
public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day49-Open excel file\\Sheet1.xlsx");
		
		short value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();

		System.out.println(value);
}
}