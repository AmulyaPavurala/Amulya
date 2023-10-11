package sorting;

public class Ascending {

	public static void main(String[] args) {
		int[]a=new int[] {999,788,709,634,584,497,876,98,14,98};
		int z=0;
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])	//9>8
				{
					z=a[x];//z=9
					a[x]=a[y];	//a[x]=8
					a[y]=z;	//a[y]=9
		
				}
			}
			System.out.println();
			for(int temp:a)
			{
				System.out.print(temp+" ");
			}
		
		}

	}

}
