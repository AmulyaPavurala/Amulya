package sorting;

public class SingleLoopAscending {

	public static void main(String[] args) {
		int a[]=new int[] {1,23,12,4,5,34,2,90};
		for(int x=0;x<a.length-1;x++)
		{
				if(a[x]>a[x+1])
				{
					int z=a[x];
					a[x]=a[x+1];
					a[x+1]=z;
					x=-1;
				}
			
		}
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
	}

}
