import java.util.Scanner;

public class Rev
{
    public static void main(String args[])
    {
       int num,rev=0,n;
       Scanner s = new Scanner(System.in);
	   
       System.out.print("Enter a Number : ");
       num = s.nextInt();
while(num>0)
{
n=num%10;
rev=rev*10+n;
num=num/10;
}
 System.out.print("reversed number is " +rev);
}
}

	   