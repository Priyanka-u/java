import java.util.Scanner;

public class Large3
{
    public static void main(String args[])
    {
        int a, b,c,large;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter 3 Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
if((a>b)&&(a>c))
{
large=a;
}
if((b>a)&&(b>c))
{
large=b;
}
else
{
large=c;
}
System.out.print("largest=" +large);
}
}