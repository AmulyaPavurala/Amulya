package com.ArrayInMethods;

import java.util.Arrays;

public class BinarySear {

	public static void main(String[] args) {
			int[] a=new int[] {12,123,14,34,15,45,16,56,17,67,18,89,51};
			int search=45,low=0,high=a.length-1,mid=0,enable=0;
			for( ;low<=high;mid=(low+high)/2)	
			{
				Arrays.sort(a);
				if(a[mid]<search)
				{
					low=mid+1;
				}
				else if(a[mid]>search)
				{
					high=mid-1;
				}
				else
				{
					enable=1;
					break;
				}
			}
			for(int temp:a)
				System.out.print(temp+" ");
			if(enable==1)
				System.out.println("element found "+mid);
			else
				System.out.println("element not found");
	
	}

}
