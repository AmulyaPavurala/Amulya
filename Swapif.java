class Swapif
{
public static void main(String args[])
{
int q=10,w=21;
System.out.println(w+ " " +q);
if(q%2==0)
{
q=q+w;
w=q-w;
q=q-w;
System.out.println(w + "  " + q);
}
}
}