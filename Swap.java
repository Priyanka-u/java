import java.util.Scanner;

 class Swap
{
    public static void main(String args[])
    {
        int a, b, temp;
        Scanner s = new Scanner(System.in);
System.out.print("enter 2 numbers");
a=s.nextInt();
b=s.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("swapped value of a=" +a);
System.out.println("swapped value of b=" +b);
}
}
		