import java.util.*;
class fibonacci{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("type the nth value to be printed");
int n=sc.nextInt();
System.out.println(getfibonacciNumber(n));
}
static int getfibonacciNumber(int n)
{
int[] a=new int[n];
a[0]=1;
a[1]=1;
for(int i=2;i<n;i++)
{
a[i]=a[i-1]+a[i-2];
}
return a[n-1];
}
}
