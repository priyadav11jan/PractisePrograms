class A
{

int x=10;
int y=20;

public A()
{
System.out.println("Running A default constructor);


}

public A(int a)
{
	this();
System.out.println("Running A argumented constructor);

}
	
public void a1()

{
	
System.out.println("Rnning a1");
}

public void a1(int z)
{

System.out.println("Running a1 argumented");
}
}


class Run1 extends A
{
int p=19;

 public Run1()
{
System.out.println("Running Run 1 default constructor);
}

public Run1(int b)
{
	super(20);
System.out.println("Running Run 1 argumented constructor);

}	
public void a1()

{

System.out.println("Rnning a1 in Run1");
}
   

	public static void main(String[] args)

	{
      Run1 r= new Run1(10);
      System.out.println(r.x);
      System.out.println(r.y);
       System.out.println(r.p);

      r.a1();
      r. a1(10);

      A a=new A();
      System.out.println(a.x);
      System.out.println(a.y);
      a.a1();
      a. a1(10);
      //System.out.println(a.p);




	}
}