import java.util.Scanner;
class Frequencyn
{
public static void main(String[] args)
{
int n,d=0;
int a[]=new int[10];
for(int i=0;i<10;i++)
{
a[i]=0;
}
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

while(n!=0)
{
d=n%10;
n=n/10;
switch(d)
{
case 0:
{
a[0]++;
break;
}
case 1:
{
a[1]++;
break;
}
case 2:
{
a[2]++;
break;
}
case 3:
{
a[3]++;
break;
}
case 4:
{
a[4]++;
break;
}
case 5:
{
a[5]++;
break;
}
case 6:
{
a[6]++;
break;
}
case 7:
{
a[7]++;
break;
}
case 8:
{
a[8]++;
break;
}
default:
{
a[9]++;

}
}}
for(int i=0;i<10;i++)
{
if(a[i]!=0)
System.out.println("The no. of"+i+"'s:    "+ a[i]);
}
}}



