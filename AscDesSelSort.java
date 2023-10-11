package sorting;

public class AscDesSelSort {

	public static void main(String[] args) {
	int a[]=new int[] {12,34,65,8,96,90,32,11,22,97,45,56,81};
	int x=0,y=0,z=0;
	Asc.Ascending(a,x,y,z);
	Des.Descending(a,x,y,z);
	Des.SelectionDes(a, x, y, z);
	System.out.println();
		System.out.println("Selection Ascending: ");
		for(x=0;x<a.length;x++)
		{
			int min=x;
			for(y=x+1;y<a.length;y++)
			{
				if(a[y]<a[min])
				{
					min=y;
				}
			}
			int var=a[min];
			a[min]=a[x];
			a[x]=var;
		}
		for(int temp3:a)
		{
			System.out.print(temp3+" ");
		}
	
}
}
class Asc
{
	public static void Ascending(int arr[],int x,int y,int z)
	{
		System.out.println("Ascending: ");
		for(x=0;x<arr.length;x++)
		{
			
		for(y=x+1;y<arr.length;y++)
		{
			if(arr[x]>arr[y])
			{
				z=arr[x];
				arr[x]=arr[y];
				arr[y]=z;	
			}
		}
		}
		
		for(int temp:arr)
		{
			System.out.print(temp+" ");
		}
	}
	
}
class Des
{
	public static void Descending(int arr[],int x,int y,int z)
	{
		System.out.println();
		System.out.println("Descending: ");
		for(x=0;x<arr.length;x++)
		{
			for(y=x+1;y<arr.length;y++)
			{
				if(arr[x]<arr[y])
				{
					z=arr[x];
					arr[x]=arr[y];
					arr[y]=z;
				}
			}
		}
		for(int temp:arr)
		{
			System.out.print(temp+" ");
		}
	}
	public static void SelectionDes(int arr[],int x,int y,int z)
	{
		System.out.println();
		System.out.println("Selection Descending: ");
		for(x=0;x<arr.length;x++)
		{
			int max=x;
		for(y=x+1;y<arr.length;y++)
		{
			if(arr[y]>arr[max])
			{
				max=y;
			}
		}
		int var=arr[max];
		arr[max]=arr[x];
		arr[x]=var;
		}
		for(int temp5:arr)
		{
			System.out.print(temp5+" ");
		}
}
}



