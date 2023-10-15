package com.ArrayInMethods;

public class AmstrongArray {

	public static void main(String[] args) {
		int a[]=new int[] {10,9,153,268};
		  int count=0,obj=0,y=0;
		  Arm arr=new Arm();
		  int out=arr.ForLoop(a,count);
		  System.out.println("Number of Armstrongs: "+ out);
		 }
		}
		class Arm
		{
		 int rem,obj=0,x,count2=0;
		 public int ForLoop(int a[],int count)
		 {
		  for(x=0;x<a.length;x++)
		  {
		   count=0;
		   for(int y=a[x];y>0;y/=10)
		   {
		    ++count;
		   }
		   obj=0;
		   for(int z=a[x];z>0;z/=10)
		   {
		    int rem1=z%10;
		    int pow=(int)(Math.pow(rem1,count));
		    obj=obj+pow;
		   }
		   if(obj==a[x]) 
		   {
		    System.out.println(a[x]);
		    count2++;
		   }
		  }
		  return count2;
			
		}
	
	}


