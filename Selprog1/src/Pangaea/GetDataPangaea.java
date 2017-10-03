package Pangaea;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class GetDataPangaea {

	public static String fromExcel1(String fname,String sname,int rindex,int cindex) {
		// TODO Auto-generated method stub
			String data=null;
			
			try{
			
			FileInputStream fis= new FileInputStream("C:\\Users\\priyadav\\Desktop\\"+fname+".xlsx");
		
			Workbook wb =WorkbookFactory.create(fis);
			
			Sheet s =wb.getSheet(sname);
			
			Row r= s.getRow(rindex);
			
			Cell c= r.getCell(cindex);
			
			data = c.toString();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return data;
	}

}
