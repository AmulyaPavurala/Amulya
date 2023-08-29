class Area
{
	public static void main(String args[])
	{
		double PI=3.14,r=2,b,c;
		b=Math.pow(r,2)*PI; //area of circle
		c=2*(PI*r); //area of circumference
		System.out.println("area of circle:" +b);
		System.out.println("area of circumference:" +c);
	}
}