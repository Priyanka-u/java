import java.util.Scanner;
class Swapa
{
public static void main(String[] args)
{
int a1,b1;
String a,b;
System.out.println("enter 2 strings");
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
Scanner sc1=new Scanner(System.in);
b=sc1.nextLine();
System.out.println("before swap"+"   "+a+ "  "+b);
a=a+b;
b = a.substring(0,a.length()-b.length());
a = a.substring(b.length());
System.out.println("after swap"+"  "+a+ "  "+b);
}}

