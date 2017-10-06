import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
String a,b,c,d;
int i=0;

System.out.println("Enter 1st string");
Scanner w=new Scanner(System.in);
a=w.nextLine();
int e=a.length();
char[] ch2=a.toCharArray();

System.out.println("enter  "+e+"  letter string with   "+ch2[0] +"  as starting letter");
Scanner x=new Scanner(System.in);
b=x.nextLine();
char[] ch=b.toCharArray();

System.out.println("enter next  "+e+"  letter string with  "+ch2[e-1] +"  as starting letter ");
Scanner y=new Scanner(System.in);
c=y.nextLine();
char[] ch1=c.toCharArray();

System.out.println("enter next  "+e+ " string with  "+ch[e-1] +"  as starting letter &  "+ch1[e-1]+"  as last letter");
Scanner z=new Scanner(System.in);
d=z.nextLine();
char[] ch3=d.toCharArray();

if(b.length()==e && c.length()==e && d.length()==e)
{
System.out.println(a);


for(int j=1;j<e;j++)
{i=0;
System.out.print(ch[j]);
while(i<e-2)
{
System.out.print(" ");
i++;
}
System.out.println(ch1[j]);
}

System.out.println(d);
}
else
{
System.out.println("The length of strings must be equal");
}


}}
