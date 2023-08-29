class Positive
{
	public static void main(String args[])
	{
	int a=0;
	if(a>0)
	{
		System.out.println("positive");
		if(a%2==0)
		{
			System.out.println("even");
		}
	else
	{
		System.out.println("odd");
	}
	}
	else if(a<0)
	{
		System.out.println("Negative");
		if(a%2==0)
		{
		System.out.println("even");
		}
	else
	{
		System.out.println("odd");
	}
	}
else
	{
	System.out.println("zero");
	}
}
}
}