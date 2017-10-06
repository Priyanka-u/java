class Duplicate
{
public static void main(String args[])
{
String s="Apple";
int count=0;
char[]ch=s.toCharArray();
System.out.println("The Duplicate letters are:");
for(int i=0;i<s.length();i++)
{
for(int j=i+1;j<s.length();j++)
{
if(ch[i]==ch[j])
{
System.out.println(ch[i]);
count++;
break;
}
}
}
}
}