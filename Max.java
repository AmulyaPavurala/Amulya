class Max
{
	public static void main(String args[])
	{
	int a=100,b=50,c=59;
	if(a>b)
	{
	a=a+b; //
	b=a-b;
	a=a-b;
	System.out.println(a+ " "+b + " " +c);
	}
	if(a>c)
	{
	a=c+a;
	c=c-a;
	a=a-c;
	System.out.println(a+ " "+b + " " +c);
	}
	if(b>c)
	{
	b=b+c;
	c=b-c;
	b=b-c;
	System.out.println(a+ " "+ b+ " " +c);
	}
	}
}
	
	
	
	
	