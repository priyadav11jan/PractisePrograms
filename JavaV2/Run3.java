class SimpleInterest

{
	public static double sI(double p,double r,double t)

        {
           double si= (p*r*t)/100;
           System.out.println("simple interest="+si);
           return si;
         }
 

}

class Run3

{
public static void main(String [] args)

{
   double a = SimpleInterest.sI(100.00,3.07,5);
   
   double amt= a+50000;
System.out.println("Amount to repAY"+amt);
   

}


}