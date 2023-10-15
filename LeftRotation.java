package com.ArrayInMethods;

public class LeftRotation {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int rotation=5;
		System.out.println("before left rotation");
		for(int tem1:a)
		{
		System.out.print(tem1+"  ");
		}
		for(int y=0;y<=rotation;y++)
		{
		int temp=a[0];
		for(int x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[a.length-1]=temp;
		}
		System.out.println();
		System.out.println();

		System.out.println("after left rotation");
		for(int tem:a)
		{
		System.out.print(tem+"  ");
		}
		
		
	}

}