class Multiplication
{
	public static void main(String args[])
	{
		int s=20,e=1,mul=0,a=2,b=0;
		while(s>=e)
		{
			mul=a*s;				//mul=2*12=24
			System.out.println(a +"*" + s + "=" + mul );    
			s--;				//s=13
			if(s%13==0)			//13%13==0
			{
				System.out.println(s );	//s=13
			}
		}
	}
}