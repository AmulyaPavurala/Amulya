package sorting;

public class SelectionsortingDescending {

	public static void main(String[] args) {
		int a[]=new int[] {20,3,45,12,87,90,34,27,89,1,2};
		int x,y;
		for(x=0;x<a.length;x++)
		{
			int max=x;
			for(y=x+1;y<a.length;y++)
			{
				if(a[y]>a[max])
				{
				max=y;
				}
			}
			int var=a[max];
			a[max]=a[x];
			a[x]=var;
		}
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
	}

}
