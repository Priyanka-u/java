class Student3
{
int rollno;
String name;
void insert(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+ " " +name);
}
}
class Teststudent3
{
public static void main(String[] args)
{
Student3 s1=new Student3();
Student3 s2=new Student3();
s1.insert(101,"rani");
s2.insert(102,"sani");
s1.display();
s2.display();
}
}
