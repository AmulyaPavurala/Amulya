package sorting;

public class Descending {

	public static void main(String[] args) {
	int a[]=new int[] {223,45,2,49,10,32,78,489,122,12};
	int x,y,z;
	for(x=0;x<a.length;x++)
	{
		for(y=x+1;y<a.length;y++)
		{
			if(a[x]<a[y])
			{
				z=a[y];//z=45
				a[y]=a[x];//a[y]=223
				a[x]=z;//a[x]=45
			}
		}
	}
	for(int temp:a)
	{
		System.out.print(temp+" ");
	}

	}

}
