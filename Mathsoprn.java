import java.util.Scanner;

public class Mathsoprn
{
    public static void main(String args[])
    {
       int a,b,c;
       Scanner s = new Scanner(System.in);
	   
       System.out.print("Enter 2 numbers ");
       a = s.nextInt();
       b = s.nextInt();
c=a+b;
System.out.println("addition=" +c);
c=a-b;
System.out.println("substraction=" +c);
c=a*b;
System.out.println("multiplication=" +c);
c=a/b;
System.out.println("division="+c);
}
}

