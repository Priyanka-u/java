import java.util.Scanner;
class Vowel
{
public static void main(String[] args)
{
char ch;
Scanner s=new Scanner(System.in);
System.out.println("enter the character");
ch=s.next().charAt(0);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
{
System.out.print(ch+ " is a vowel");
}
else
{
System.out.print(ch+ " is not a vowel");
}
}
}