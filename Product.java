class Product
{
	public static void main(String args[])
	{
		double maxprice=51266,price=40000,discount;
		if(price>47000)
		{
		discount=16.0/100*maxprice;
		System.out.println("discount of 10%" + discount);
		}
		else
		{
		discount=5.0/100*maxprice;
		System.out.println("discount of 5%" + discount);
		}

	}
}	