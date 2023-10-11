package sorting;

public class Bubble 
{
	public static void main(String[] args)
	{
		int a[]=new int[] {12,23,24,45,67,90,78};
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-1-x;y++)
			{
				if(a[y]>a[y+1])
				{
				int z=a[y];
				a[y]=a[y+1];
				a[y+1]=z;
				}
			}
		}
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
	}

}
