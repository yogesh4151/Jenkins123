package Opne_Excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_verifyTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day51-Excle 3\\Sheet3.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		CellType value = sh.getRow(0).getCell(0).getCellType();
		System.out.println(value);
		
		
	}

}
