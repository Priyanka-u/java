import java.util.Scanner;

public class Amstrong
{
    public static void main(String args[])
    {
        int n,t,num,sum=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Positive Number : ");
        num= scan.nextInt();

t=num;
while(num>0)
{
n=num%10;
sum=sum+(n*n*n);
num=num/10;
}
if(t==sum)
{
System.out.println("amstrong");
}
else
{
System.out.print("not amstrong");
}
}
}
		