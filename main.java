class Ranges
{
public static void main(String args[])
{
int n=51;
if(n%2==0)
{
	if(n>0 && n<9)
	{
	System.out.println("even and single digit");
	}
	else if(n>9 && n<99)
	{
	System.out.println("even and double digit");
	}
	else if(n>99 && n<999)
	{
	System.out.println("even and thriple digit");
	}
}
else
{
System.out.println("odd");
}
	if(n>0 && n<9)
	{
	System.out.println("odd and single digit");
	}
	else if(n>9 && n<99)
	{
	System.out.println("odd and double digit");
	}
	else if(n>99 && n<999)
	{
	System.out.println("odd and thriple digit");
	}
}
}