package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_celltype_row_cell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day51-Excle 3\\Sheet3.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	int lastrowindex = sh.getLastRowNum();
	for(int i=0;i<=lastrowindex;i++)
	{
		int lastcellindex = sh.getRow(i).getLastCellNum()-1;
		
		for(int j=0;j<=lastcellindex;j++)
		{
			 Cell cellinfo = sh.getRow(i).getCell(j);
			 CellType s = cellinfo.getCellType();
			 
			 if(s==CellType.STRING)
			 {
				 String value = sh.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value+" ");
			 }
			 if(s==CellType.NUMERIC)
			 {
				 double value = sh.getRow(i).getCell(j).getNumericCellValue();
				 System.out.print(value+" ");
			 }
			 if(s==CellType.BOOLEAN)
			 {
				 boolean value = sh.getRow(i).getCell(j).getBooleanCellValue();
				 System.out.print(value+" ");
			 }
		  }
		
		System.out.println();
		
	}
}

}
