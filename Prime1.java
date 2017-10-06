import java.util.Scanner;
class Prime1
{

public static void main(String[] args)
{
int num,flag=0,i;
Scanner s=new Scanner(System.in);
System.out.println("enter number");
num=s.nextInt();
for(i=2;i<num;i++)
{
if(num%i==0)
   {
    System.out.println("not prime");
     flag=1;
     break;
   }
}
if(flag==0)
{
System.out.println("prime");
}
}
}