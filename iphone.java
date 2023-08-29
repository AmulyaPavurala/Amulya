class  mobile
{	
	public static void main(String args[])
	{
		String name="Apple iphone 14 blue,128gb";
		int actual_price=79900;
		double price_with_off=(14.0/100)*79900;
		double price=actual_price-price_with_off;
		double maxprice= price+99;
		double price_with_bankoffer=(5.0/100)*maxprice;
		double total=maxprice-price_with_bankoffer;
		System.out.println("14 %off: " + price_with_off);
		System.out.println("discountprice: " + price);
		System.out.println("maxprice: " + maxprice);
		System.out.println("5% cashback: " + total);
		
	}
}