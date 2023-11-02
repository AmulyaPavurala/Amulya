package OverLoadingAndRiding;

public class Refernce {
	public static void main(String args[]){
	Refernce r=new Child();	//pointing child object to parent reference
	r.method2(); 
	r.method1();

		/*Child.method1();
		Child.method2(); 
		Child.method3();
		Child.method4(); 
		Child.method5();*/	
	}
	void method1()
	{
		System.out.println("Pm1");
	}
	 void method2()
	{
	System.out.println("Pm2");	
	}
}
class Child extends Refernce
{
	 void method2()
	{
		System.out.println("child m2");
	}
 void method3()
	{
		System.out.println("Cm3");
	}
 void method4()
	{
		System.out.println("Cm4");
	}
	 void method5()
	{
		System.out.println("Cm5");
	}
}
