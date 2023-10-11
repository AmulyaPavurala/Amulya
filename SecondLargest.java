package sorting;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	int a[]=new int[] {12,2,34,45,76,12,2,76,76,89,9,120};
	boolean b[]=new boolean[a.length];
	int c[]=new int[a.length];
	int x=0,y=0,count=0;
	Arrays.sort(a);
	for(x=0;x<a.length;x++)
	{
		count=0;
		if(b[x]==true)
		{
			continue;
		}
		for(y=x+1;y<a.length;y++)
		{
			if(a[x]==a[y])
			{
				b[y]=true;
				count++;
			}
		}
	}
		System.out.print(a[a.length-2]+" ");
	
	}
}