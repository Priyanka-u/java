class Str10
{  
public static void main(String args[])
{
String s1="this is simple le";
int i1=s1.indexOf("is");
int i2=s1.indexOf("simple");
System.out.println(i1+ " " +i2);
int i3=s1.indexOf("is",4);
int i4=s1.indexOf("le",14);
int i5=s1.indexOf('m');
System.out.println(i3+ " " +i4+ " " +i5);
}
}