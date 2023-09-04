class LeapYear
{
public static void main(String args[])
{
int SYear=1947,EYear=2024,a=0,c;
	while(SYear<=EYear)						//CHECKS YEARS IN RANGE OF 1947 AND 2024 
	{
		if(SYear%4==0 && SYear%100!=0 || SYear%400==0)			//CHECKS LEAP YEAR OR NOT (1947)
		{
		System.out.println(SYear  +" is a leap year");			// PRINTS LEAP YEAR(1948)
		// a++;							
		// System.out.println(a);					//PRINTS NUMBER OF LEAPYEARS(1)
		c=SYear+12;						
		System.out.println(c+"is a super leap year");			//PRINTS SUPER LEAP YEAR1948+12=1960
		}
		// else
		//{
		//System.out.println(SYear  +" is not a leap year");			//PRINTS A YEAR WHICH IS NOT A LEAP YEAR(1947)
		//}
	SYear++;								// INCREMENT THE YEAR VALUE BY 1 (1948)
	}
}
}