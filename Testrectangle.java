class Rectangle
{
int length,breadth;
void insert(int l,int b)
{
length=l;
breadth=b;
}
void display()
{
int p=length*breadth;
System.out.println(p);
}
}
class Testrectangle
{
public static void main(String[] args)
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(2,3);
r2.insert(3,3);
r1.display();
r2.display();
}
}
