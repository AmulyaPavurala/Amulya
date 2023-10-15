package com.ArrayInMethods;

import java.util.Arrays;

public class ClassesObjects {

	public static void main(String[] args) {
		int[] arr=new int[] {12,123,14,34,15,45,16,56,17,67,18,89,51};
		int x=0,search=89,index=4,enable=0,mid=0;
		Twin.Leftrotation(arr,x);
		Twin.Rightrotation(arr,x);
		Twin.Insertion(arr,x);
		Twin.Deletion(arr,x,index);	//classname.methodname(); //static in method
	int b=Twin.BinarySearch(arr,x,search,enable,mid);
			if(b==1)
				System.out.println("element found "+mid);
			else
				System.out.println("element not found");

}
class Twin
{
	public static void Leftrotation(int[]a,int x)
	{
		int y=a[0] ;
		for(x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		a[a.length-1]=y;
		System.out.println("left rotation");
		for(int temp:a)
		{
			System.out.print(temp+" ");	
		}
	}
	public static void Rightrotation(int[]arr,int x)
	{
		System.out.println();
		int y=arr[arr.length-1];
		for( x=arr.length-1;x>0;x--)
		{
			arr[x]=arr[x-1];
		}
		arr[0]=y;
		System.out.println("right rotation");
		for(int temp:arr)
		{
			System.out.print(temp+" ");	
		}
	}
	public static void Insertion(int[]a,int x)
	{
		System.out.println();
		int index=5,element=111;
		for(x=a.length-1;x>5;x--)
		{
			a[x]=a[x-1];
		}
		a[index]=element;
		System.out.println("Insertion");
		for(int temp:a)
		{
			System.out.print(temp+" ");	
		}
	}
	public static void Deletion(int[]a,int x,int index)
	{
		System.out.println();
		for(x=index;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		System.out.println("Deletion");
		for(int temp:a)
		{
			System.out.print(temp+" ");	
		}

	}
	public static int BinarySearch(int[]a,int x,int search,int enable,int mid)
	{
		System.out.println();
		System.out.println("After sorting");
		Arrays.sort(a);
		for(int temp:a)
		{
			System.out.print(temp+" ");	
		}

		int low=0,high=a.length-1;
		System.out.println();
		for( ;low<=high;mid=(low+high)/2)	
		{
			if(a[mid]>search)
			{
				high=mid-1;
			}
			else if(a[mid]<search)
			{
				low=mid+1;
			}
			else
			{
				enable=1;
				break;
			}
		}
		return enable;
	}
	
}
}
