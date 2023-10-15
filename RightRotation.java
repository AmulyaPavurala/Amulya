package com.ArrayInMethods;

public class RightRotation {

	public static void main(String[] args) {
		int[]a=new int[] {10,20,30,40,50,60,70,80,90,100};
		int rotations=4;int temp=0;
		for(int y=0;y<rotations;y++)
		{
			temp=a[a.length-1];
			for(int x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			}
			a[0]=temp;
		}
		for(int var:a)
			System.out.print(var+" ");
		
	}

}
