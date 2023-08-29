class Check
{
public static void main(String args[])
{
	char n='!';
	if(n>='a' && n<='z')
	{
	System.out.println("small");
		if(n=='a' || n=='e' || n=='o' || n=='i' || n=='u')
		{
		System.out.println("vowles");
		}
		else
		{
		System.out.println("consonents");
		}
	}
	if(n>='A' && n<='Z')
	{
	System.out.println("capital");
		if(n=='A' || n=='E' || n=='O' || n=='I' || n=='U')
		{
		System.out.println("vowles");
		}
		else
		{
		System.out.println("consonents");
		}
	}
	if(n>='0' && n<='9')
	{
	System.out.println("numbers");
	}
	else
	{
	System.out.println("symbols");
	}
	
}
}
	