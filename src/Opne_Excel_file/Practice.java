package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Practice 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day51-Excle 3\\Sheet3.xlsx");
		
				Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
				int lastcell = sh.getRow(0).getLastCellNum()-1;
				for(int i=0;i<=lastcell;i++)
				{
					Cell cellinfo = sh.getRow(0).getCell(i);
					CellType s1 = cellinfo.getCellType();
					
					if(s1==CellType.STRING)
					{
						String value = cellinfo.getStringCellValue();
						System.out.println(value+" ");
					}
					else if(s1==CellType.NUMERIC)
					{
						double value = cellinfo.getNumericCellValue();
						System.out.println(value);
					}
					else if(s1==CellType.BOOLEAN)
					{
						boolean value = cellinfo.getBooleanCellValue();
						System.out.println(value);
					}
		
				}

				
	
	}
}
