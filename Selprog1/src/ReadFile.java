import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("C:\\Users\\priyadav\\Pictures\\TaskStory_Analysis.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet s = wb.getSheet("sheet1");
		
                 int lastrow =s.getLastRowNum();
            for(int i=0;i<=lastrow;i++) 
            {
	
		Row r = s.getRow(i);
		int lastcell= r.getLastCellNum();
		for(int j=0;j<lastcell;j++)
		{
		
		Cell c =r.getCell(j);
		
		String data = c.toString();
		System.out.println(data);
		}}

	}

}
