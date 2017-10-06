import java.util.Scanner;

public class Adddigits
{
    public static void main(String args[])
    {
       int num,n,sum=0;
       Scanner s = new Scanner(System.in);
	   
       System.out.print("Enter number ");
       num = s.nextInt();
while(num>0)
{
n=num%10;
sum=sum+n;
num=num/10;
}
 System.out.print("sum of digit =" +sum);
}
}

