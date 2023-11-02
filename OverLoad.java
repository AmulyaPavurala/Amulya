package OverLoadingAndRiding;

public class OverLoad {

	public static void main(String[] args) 
	{
		//OverLoad o=new OverLoad();
		OverLoad .method1(10,20);
		OverLoad.method1(11.0,12.0);
		OverLoad.method1('a','b');
		OverLoad.method1(10,20,30);
	}
		static void method1(int a,int b)
		{
			System.out.println("method1");
		}
		static void method1(double a,double b)
		{
			System.out.println("method2");
		}
		static void method1(char a,char b)
		{
			System.out.println("method3");	
		}
		static void method1(int a,int b,int c)
		{
			System.out.println("method4");
		}
	
}

