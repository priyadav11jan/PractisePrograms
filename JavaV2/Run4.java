

class RemoteWebDriver implements WebDriver
{
	
 void close()


 {
  System.out.println("Closing in Remote class");

 }
 void  start()

 {
System.out.println("Starting in Remote class");

 }
 }



class FirefoxDriver extends RemoteWebDriver
{
	public Firefox
	{



	}




}

Class Run4

{
	WebDriver wb= new FirefoxDriver();

	wb.start();

}

