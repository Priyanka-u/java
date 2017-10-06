import java.util.Scanner;
class Avg
{
public static void main(String[] args)
{
int a[]=new int[5];
float sum=0,avg,perc;
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter the marks");
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
sum=sum+a[i];
}
avg=sum/5;
perc=(sum/500)*100;
System.out.println("average=" +avg);
System.out.println("percentage=" +perc+ "%");
}
}
