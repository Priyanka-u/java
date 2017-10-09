class Str4
{
public static void main(String[] args)
{
String s1="java string ";
s1.concat(" is mutable");
System.out.println(s1);
s1= s1.concat("is mutable ");
System.out.println(s1);  
s1= s1.concat("so assign it explicitly");
System.out.println(s1); 
}
}