class PerfectFac
{
public static void main(String args[])
	{
	int start=1,end=4,var=0;
	while(start<end)
		{
			if(end%start==0)
				{
				var=var+start;
				}
		start++;
		}
	if(var==end)
		{
			System.out.println("Perfect Factorial");
		}
		else
		{
			System.out.println("not a perfect factorial");
		}
	}
}
	
