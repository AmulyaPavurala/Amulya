class Discount
{
public static void main(String args[])
{
double total=1500,discount;
discount=10.0/100*total;
if(total>2000)
{
System.out.println("discount with 10:" + discount);
}
else
{
discount=5.0/100*total;
System.out.println("discount with 5:" + discount);
}
}
}
