class Palindrome

{
static String str="Madam";
static String str1="";

	public static void main(String [] args)
	{
 	System.out.println(str.length());

	for(int i=str.length()-1;i>=0;i--)
		{
		str1=str1+str.charAt(i);

		}
	System.out.println(str1);

	}
if (str.equals(str1))
{

System.out.println("Entered string is a palindrome");
}
 


	
}