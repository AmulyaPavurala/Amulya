class ci
{
       public static void main(String args[])
	{
		double a,p=1000,r=2,t=20,ci,roots;
		a=p*Math.pow(1+r/100,t);
		System.out.println("amount:" + a);
		ci=a-p;
		System.out.println("compound interest:" + ci);

	}
}
	