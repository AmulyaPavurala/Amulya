package OverLoadingAndRiding;

public class OverRide {

	public static void main(String[] args) 
	{
		Over o=new Over();
		o.method1();
		o.method2();
		o.method();
	}
	void method1()
	{
		System.out.println("class 1 method1");
	}
	void method2()
	{
		System.out.println("method2");
	}

}
class Over extends OverRide
{
	void method1()//in over riding parameters should be same but in different classes by using is a relationship 
	{
		System.out.println("class 2 method1");
	}
	void method()
	{
		System.out.println("class2 method 2");
	}
}
