import java.util.Scanner;
class Data1
{
public static void main(String args[])
{
int a,b,c,d;
Scanner x=new Scanner(System.in);
a=x.nextInt();
Scanner y=new Scanner(System.in);
b=x.nextInt();
Scanner z=new Scanner(System.in);
c=x.nextInt();
Scanner w=new Scanner(System.in);
d=x.nextInt();

int flag=0;
if(a==13)
{
System.out.println(c+d);
flag=flag+1;}
else if(b==13)
{
System.out.println(d+a);
flag=flag+1;
}
else if(c==13)
{
System.out.println(a+b);
flag=flag+1;
}
else if(d==13)
{
System.out.println(b+c);
flag=flag+1;
}
if(flag==0)
{
System.out.println(a+b+c+d);
}
}
}