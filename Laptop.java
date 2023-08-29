class hp
{
	public static void main(String args[])
	{
		String name="hp 15s(2023)";
		System.out.println("name :" +name);
		String processor="intel core i5 11th gen";
		System.out.println("processor :" + processor);
		String ram = "16gb|512gb";
		System.out.println("RAM|SSD processor :" + ram);
		String screensize="15.6 inch";
		System.out.println("Screen size :" + screensize);
		String os="windows  11";
		System.out.println("operating System :" + os);
		String weight="1.69kg";
		System.out.println("Weight: " + weight);
		int maxprice=59327;
		System.out.println("maxprice :" + maxprice);
		double discount=5.0/100*maxprice;
		System.out.println("discount :" + discount);
		double price=maxprice-discount;
		System.out.println("price :" + price);
		double cashback=5.0/100*price;
		System.out.println("%5 cashback:" + cashback);
		double finalprice=price-cashback;
		System.out.println("finalprice:" +finalprice);
	}
}