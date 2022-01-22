package Excel_ReadaAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String[] args) throws IOException {	
		File path = new File("C:\\Users\\SONY\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		FileOutputStream write = new FileOutputStream(path);
		sheet.createRow(1).createCell(0).setCellValue("Nikhil");
		workbook.write(write);
	}
}
