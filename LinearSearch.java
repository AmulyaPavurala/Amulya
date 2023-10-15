package com.ArrayInMethods;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int enable=0,search=89;
		Scanner s=new Scanner(System.in);
		System.out.println("enter array values");
		int[] a=new int[4];
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=s.nextInt();
		}
		LinearSearch l=new LinearSearch();
		l.Method(a,enable, search);
	}
	public void Method(int[] a,int e,int s) 
	{
		for(int x:a)
		{
			if(x==s)
			{
				e=1;
				System.out.println(x);
				break;
			}
		}
		if(e==1)
			System.out.println("element found");
		else
			System.out.println("element not found");
	}

	}


