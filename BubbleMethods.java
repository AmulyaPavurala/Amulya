package sorting;

public class BubbleMethods {

	public static void main(String[] args) {
		int[] a=new int[] {12,34,45,56,67,98,21,20};
		int x=0,y = 0,z=0;
		Bubble(a,x,y,z);
		Arr(a);
	}
		public static void Bubble(int a[],int x,int y,int z) {
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<a.length-1-x;y++)
			{
				if(a[y]>a[y+1])
				{
				z=a[y];
				a[y]=a[y+1];
				a[y+1]=z;
				}
			}
		}
		}
	public static void Arr(int a[])
	{
		for(int temp:a)
			{
				System.out.print(temp+" ");
			}
		
	}
		
	
	
}

