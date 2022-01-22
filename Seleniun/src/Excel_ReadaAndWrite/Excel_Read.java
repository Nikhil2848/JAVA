package Excel_ReadaAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	
	public static void main(String[] args) throws IOException  {
		
	 	File path = new File("C:\\Users\\SONY\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");
	 	
	 	FileInputStream load = new FileInputStream(path);
	 	
	 	XSSFWorkbook workbook = new XSSFWorkbook(load);
	 	
	 	XSSFSheet sheet1 = workbook.getSheetAt(0);
	 	
	 	String data = sheet1.getRow(10).getCell(3).getStringCellValue();
	 	System.out.println(data);
	}

}
