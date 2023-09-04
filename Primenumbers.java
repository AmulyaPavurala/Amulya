class Primenumbers
{
public static void main(String args[])
{
	int start=1,end=10,count=0;
	while(start<=end)	
	{
		if(end%start==0)
		{
			count++;
		}
		
	start++;
	}
	System.out.println(count);
}
}

		