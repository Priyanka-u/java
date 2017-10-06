import java.util.Scanner;
class Grade
{
public static void main(String[] args)
{
int n;
int a[]=new int[5];
float sum=0,avg;
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter marks");
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
sum=sum+a[i];
}
avg=sum/5;
if(avg>=80)
{
System.out.println("A");
}
else if(avg<80&&avg>=60)
{
System.out.println("B");
}
else if(avg<60&&avg>=40)
{System.out.println("C");
}
else
System.out.println("failed");
}
}