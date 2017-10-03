package testpackage;

public class TestException {
	
	static int i=10;
	static int j=0;
	
			

	public static void main(String[] args)throws Exception {
		
     
     
     try
     {
    	 
    	 int k=i%j;
     }
     catch(Exception e)
     
     {
    	 
    	 System.out.println("Runnig cathh");
    	 
    	 e.printStackTrace();
     }
     
     
     finally
     {
    	 
    	 System.out.println("Running Finally");
    	 
     }
	}
	
	
	
	
	
	

}
