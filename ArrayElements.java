package sorting;

public class ArrayElements {

	public static void main(String[] args) {
	int a[]=new int[] {20,12,3,4,5,9,80,12,4,1,20,67};
	boolean[] b=new boolean[a.length];
	int y=0,x=0,count=0;
	System.out.println("Array elements & its Frequency");
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
		System.out.println(a[x]+"       "+count);
	}
	}
}
