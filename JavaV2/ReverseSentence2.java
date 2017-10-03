class ReverseSentence2
{

static String str= "I love india";
static String str1="";

	
public static void main(String[] args)

{
	
String [] arr= str.split("");

for(int i= arr.length-1;i>=0;i--)
{
	str1=str1+ " " + arr[i];


}

System.out.println(str1);

}





}