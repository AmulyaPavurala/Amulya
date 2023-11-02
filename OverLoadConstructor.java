package OverLoadingAndRiding;

public class OverLoadConstructor {
	public static void main(String args[])
	{
		new OverLoadConstructor();
		new OverLoadConstructor(10,10);
		new OverLoadConstructor('a',10);
		new OverLoadConstructor(100,200,29);
	}
	int a,b,c;
		OverLoadConstructor()
		{
			System.out.println("Default constructor");
		}
		OverLoadConstructor(int a,int b)
		{
			System.out.println("int int");
		}
		OverLoadConstructor(char a ,int b)
		{
			this();	//calls default constructor
			System.out.println("char int");
		}
		OverLoadConstructor(int a,int b,double c)
		{
			this.a=190;		//here this points to object
			this.b=201;
			this.c=292;
			System.out.println(c);
		}
		
	}

