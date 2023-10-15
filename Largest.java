package com.ArrayInMethods;

public class Largest {
public static void main(String args[])
{
int[] a=new int[] {1928739,87399289,28769392,83681290};
int largest=0;
for(int x=1;x<a.length;x++)
{
	if(a[largest]<a[x])
	{
		largest=x;
	}
}
System.out.println(a[largest]);
}
}
