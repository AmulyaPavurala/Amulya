package sorting;
import java.util.Arrays;
public class LargestSecond {

	public static void main(String[] args) {
		int[] a=new int[] {12,2,34,45,76,12,2,76,76,89,9,120};
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
		for(int y=a.length-1;y>=0;y--)
		{
			if(a[y]!=a[a.length-1])
			{
				System.out.println(a[y]);
				break;
			}
		}
	}

}
