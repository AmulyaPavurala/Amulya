package com.ArrayInMethods;

public class Smallest {

	public static void main(String[] args) {
		int a[]=new int[] {9876,23456,7821,12123,8769};
		int smallest=0;
		for(int x=1;x<a.length;x++)
		{
			if(a[smallest]>a[x])
			{
				smallest=x;
			}
		}
		System.out.println(a[smallest]);
	}

}
