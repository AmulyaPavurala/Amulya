class Increment
{
public static void main(String args[])
{
int a=12,b;
a=a++;	
b=++a;
a=--b;	
System.out.println(a);
System.out.println(b);
System.out.println(a+b);
}
}