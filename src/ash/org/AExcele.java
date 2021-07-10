package ash.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AExcele {
public static void main(String[] args) throws IOException {
	
	//file initiation
	File excelloc = new File("C:\\Users\\devap\\Documents\\Driver Jars\\testExcel.xlsx");
	//convert it to object type
	FileInputStream stream = new FileInputStream(excelloc) ;
	//workbook creation
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Data");
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	System.out.println(c);
		/*
		 * System.out.println("cell value="+c); 
		 * CellType type = c.getCellType();
		 * System.out.println("cell type="+type);
		 */
		/*
		 * if (type==CellType.STRING) { 
		 * String stringCellValue = c.getStringCellValue();
		 * 
		 * System.out.println(stringCellValue); 
		 * } 
		 * else { 
		 * double numericCellValue = c.getNumericCellValue(); 
		 * long l = (long)numericCellValue; 
		 * String valueOf = String.valueOf(l);
		 *  System.out.println(valueOf); }
		 */
	
	//update data
	
		/*
		 * c.setCellValue("prash"); FileOutputStream fout = new
		 * FileOutputStream(excelloc); w.write(fout); System.out.println("done");
		 * 
		 * //new worksheet creation
		 * 
		 * Sheet S = w.createSheet("date"); Row R = S.createRow(1); Cell C =
		 * R.createCell(1); C.setCellValue("Prash@123"); FileOutputStream f = new
		 * FileOutputStream(excelloc); w.write(f); System.out.println("done");
		 */
		
	}
     
     
     
     
     
     
     
     
}

