class ReverseSentence

{
static String str="I am a Selenium developer";
static String str1="";

	public static void main(String [] args)
	{
 	System.out.println(str.length());

       String [] strArr= str.split(" ");

	for(int i=strArr.length-1;i>=0;i--)
		{
		str1=str1+""+strArr[i];
                

		}
         
	System.out.println(str1);

	}

 }