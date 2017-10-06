import java.util.Scanner;

public class Palindromenum
{
    public static void main(String args[])
    {
       int num,n, rev=0,orig;
       Scanner s = new Scanner(System.in);
	   
       System.out.print("Enter a Number : ");
       num = s.nextInt();
orig=num;
while(num>0)
{
n=num%10;
rev=rev*10+n;
num=num/10;
}
if(orig==rev)
{
System.out.print("reverse is equal");
}
else
System.out.print("reverse not equal");
}
}