import java.io.*;


import org.apache.*;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		File f= new File("C:\\Users\\priyadav\\Desktop\\Creds.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		

		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet st = wb.getSheet("Sheet1");
		
		
		
			int lastRowNum=st.getLastRowNum();
			
			for(int i=0;i<=lastRowNum;i++)
			{
			
				Row r = st.getRow(i);
				
				int lastcell= r.getLastCellNum();
				
				for (int j=0;j<lastcell;j++)
				{
				 r = st.getRow(i);
				Cell c= r.getCell(j);
				
		
				String  data= c.toString();
		
				System.out.println(data);
				}
			}
			
			
			/*Row r = st.getRow(0);
			
			int lastcell = r.getLastCellNum();
			
			for(int j=0;j<lastcell;j++)
			
			
			{
			Cell c= r.getCell(j);
			
			String  data1= c.toString();
			
			System.out.println(data1);
			}
			
			Row r1 = st.getRow(1);
			
			int lastcell1 = r1.getLastCellNum();
			
			for(int k=0;k<lastcell1;k++)
				
				
			{
			Cell c= r1.getCell(k);
			
			String  data2= c.toString();
			
			System.out.println(data2);
			}
			*/
	}
}

			
			
			
			
