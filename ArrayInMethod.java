package com.ArrayInMethods;

import java.util.Scanner;

public class ArrayInMethod {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array values:");
		int a[]=new int[5];
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=s.nextInt();
		}
	Method m=new Method();
	m.ArrDisplay(a);
	System.out.println(a);		//array object hashcode
	}

}
class Method
{
	public void ArrDisplay(int x[])
	{
		for(int y:x)			//for each or enchanced for loop
		System.out.println(y);
	}
}
		