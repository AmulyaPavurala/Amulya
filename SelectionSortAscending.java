package sorting;

public class SelectionSortAscending {

	public static void main(String[] args) {
		int a[]=new int[] {15,17,19,2,12,34,6,8,9};
		int x,y;
		for(x=0;x<a.length;x++) {
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
		System.out.println();
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
		}
	}

}
