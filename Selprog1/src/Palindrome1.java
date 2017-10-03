
public class Palindrome1 {
	
	static String s1= "application is good";
	
	static String s2="";
	

	public static void main(String[] args) {
		
		String [] arr1= s1.split(" ");
		
		for(int i=arr1.length-1;i>=0;i--)
		{
		s2= s2 + "" + arr1[i];
		}
System.out.println(s2);
	}

}
