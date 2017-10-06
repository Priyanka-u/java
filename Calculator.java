import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
       int a,b,c;
        char ch;
       Scanner s = new Scanner(System.in);
	   
       System.out.print("Enter 2 numbers ");
       a = s.nextInt();
       b = s.nextInt();
 System.out.println("enter the symbol(+,-,*,/)");
ch=s.next().charAt(0);
switch(ch)
{
case '+' :
c=a+b;
 System.out.println("addition=" +c);
break;
case '-' :
c=a-b;
 System.out.println("substraction=" +c);
break;
case '*' :
c=a*b;
 System.out.println("multiplication=" +c);
break;
case '/' :
c=a/b;
 System.out.println("division=" +c);
break;
default:System.out.println("exit");
}
}
}






