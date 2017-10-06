import java.util.Scanner;
class Frequencya
{
public static void main(String[] args)
{
String str;
System.out.println("Enter any string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
int l = str.length();
char ch;
int c=0;
for(char i='a';i<='z';i++)
{
c=0;
for(int j=0;j<l;j++)
{
ch=str.charAt(j);
if(ch==i)
c++;
}
if(c!=0)
{
System.out.println(i+"\t\t"+c);
}
}}}