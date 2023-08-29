
class Roots
{
	public static void main(String args[])
	  {
		double a=1,b=-9,c=14,d,r1,r2;
		d=Math.pow(b,2)-(4*a*c);
		System.out.println(d);
		r1=(-b+Math.sqrt(d))/2*a;
		System.out.println((int)r1);
		r2=(-b-Math.sqrt(d))/2*a;
		System.out.println((int)r2);
	   }
}
		