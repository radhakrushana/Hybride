package CommanUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {
	
   public String getWriteDataFromExcelsheet(String sheetname,int rownumber,int cellnumber) throws FileNotFoundException {
	 
	   FileOutputStream Outfile = new FileOutputStream("src\\test\\resources\\Book6.xlsx");
	   Workbook wb = WorkbookFactory.create(Outfile);
		
		Sheet sh = wb.getSheet(sheetname);
		
		Row rw = sh.getRow(rownumber);
		
		Cell cl = rw.getCell(cellnumber);
		
		String value = cl.getStringCellValue();
		return value;
   }
}
