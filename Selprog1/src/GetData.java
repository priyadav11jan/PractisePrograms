import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {


	public static String fromExcel(String fname,String sname,int rindex,int cindex)
		
		{
				
			String data=null;
		
		
		try
		{
		
		File f = new File("C:\\Users\\priyadav\\Desktop\\"+fname+".xlsx");
				FileInputStream fis= new FileInputStream(f);
				
				Workbook wb=WorkbookFactory.create(fis);
			Sheet st	=wb.getSheet(sname);
			Row r=st.getRow(rindex);
			Cell c=r.getCell(cindex);
			  data = c.toString();
			
				
		}
			catch(Exception e)
		{
		
		}
		
		
		return data;	
		}
		
	
	
}	

	

