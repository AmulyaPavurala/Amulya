package com.ArrayInMethods;

public class Deletion {

	public static void main(String[] args) {
		int[]a=new int[] {10,20,30,40,50};
		int index=2,x;
		for(x=index;x<a.length-1;x++)
		{
		a[x]=a[x+1];
		}	
		for(x=0;x<a.length;x++)
		{
		System.out.print(a[x]+" ");
		}	
	
	}

}
