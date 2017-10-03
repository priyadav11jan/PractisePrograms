package testpackage;

public class Palindrome {
    static String str= "I am a selenium developer";
    static String str1="";
	public static void main(String[] args) {
		
		String[] arr1= str.split(" ");
		
		for(int i=arr1.length-1;i>=0;i--)
         {
        	 str1= str1+" "+ arr1[i];
        	 
        	 }
         System.out.println(str1);
	}

}
