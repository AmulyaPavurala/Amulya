package OverLoadingAndRiding;

public class OverRideStatic {
	public static void main(String[] args) {
		Statics.Method1(10,20);
		Statics.method2('a',"AMMU");
		Statics.method3(8, 9);
		Statics.method8();	//parent method8 is hiding
		/*Ovver o=new Statics();
		o.method8();
		Statics.Method1(10,20);
		Statics.method2('a',"AMMU");
		Statics.method3(8, 9);*/	//child method8 is hiding
	}
}
class Ovver
{
	public static void method8()
	{
		System.out.println("method1 over");	//method hiding
	}
}
class Statics extends Ovver
{
	public static void Method1(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void method2(char a,String b)
	{
		System.out.println("sec "+a+" "+"name "+b);
	}
	public static void method3(int x,int y)
	{
		System.out.println(x+ " "+ y);
	}
	public static void method8()
	{
		System.out.println("iii");
	}
	
}
