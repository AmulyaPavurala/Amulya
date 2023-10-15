package com.ArrayInMethods;

public class Insertion {

	public static void main(String[] args) {
		int[] arr=new int[] {11,23,34,45,65,56,76,67,78,89,98,90,9};
		int x,index=5,element=100;
		System.out.println("Before insertion");
		for(int temp:arr)
		{
			System.out.print(temp +" ");
		}
		for(x=arr.length-1;x>index;x--)
		{
			arr[x]=arr[x-1];

		}
		arr[index]=element;
		System.out.println();
		System.out.println("after insertion");
		for(int temp:arr)
		{
			System.out.print(temp +" ");
		}

}
}
