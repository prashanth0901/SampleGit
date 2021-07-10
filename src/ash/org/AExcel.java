package ash.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AExcel {
	
	public static void main(String[] args) throws IOException {
		File excelloc = new File("C:\\Users\\devap\\Documents\\Driver Jars\\testExcel.xlsx");
		//convert to object type
		FileInputStream stream = new FileInputStream(excelloc);
		
		//workbook creation
		Workbook w = new XSSFWorkbook(stream);
		//sheet
		Sheet s = w.getSheet("Data");
		//rows iteration
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int k = 0; k < r.getPhysicalNumberOfCells(); k++) {
				Cell c = r.getCell(k);
				System.out.println(c);
				
			}
			
			
		}
		
	}

}

