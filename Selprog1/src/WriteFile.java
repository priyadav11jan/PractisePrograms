import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		
		
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\priyadav\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb =WorkbookFactory.create(fis);
		Sheet s= wb.getSheet("Sheet1");
		Row r =s.getRow(0);
		Cell c =r.getCell(0);
		
		c.setCellValue("Hello");
		
		
		
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
	
		
		

	}

}
