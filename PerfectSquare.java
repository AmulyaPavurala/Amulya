class PerfectSquare
{
	public static void main(String args[])
          {
	double a=18,b;
	b=Math.sqrt(a); //sqrt b= 4
	if(a%b==0) // 16%4=0
	     {
		System.out.println(a + "is a perfect square");
	     }
	   else
	     {
		System.out.println(a + "is not a perfect square");
	     }
          }
}