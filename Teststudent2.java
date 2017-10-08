class Student2
{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayInfo()
{
System.out.println(rollno+ " " +name);
}
}
class Teststudent2
{
public static void main(String[] args)
{
Student2 s1=new Student2();
Student2 s2=new Student2();
s1.insertRecord(101,"rani");
s2.insertRecord(102,"sani");
s1.displayInfo();
s2.displayInfo();
}
}
