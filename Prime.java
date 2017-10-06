import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
int num,count=0,i;
Scanner s=new Scanner(System.in);
System.out.println("enter the number to check whether it is prime or not");
num=s.nextInt();
for(i=2;i<num;i++)
{
    if(num%i==0)

     {
         count++;
         break;

      }
}
if(count==0)
{
System.out.println("the number is  prime");
}
else
{
System.out.println("the number is not prime");
}
}
}