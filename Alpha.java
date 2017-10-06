import java.util.Scanner;
class Alpha
{
public static void main(String[] args)
{
char ch;
Scanner s=new Scanner(System.in);
System.out.println("enter the character");
ch=s.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.print(ch+ " is a character");
}
else
{
System.out.print(ch+ " is not a character");
}
}
}