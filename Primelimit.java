import java.util.Scanner;
class Primelimit
{
public static void main(String[] args)
{
int p;
int start,end;
Scanner s=new Scanner(System.in);
System.out.println("enter the starting number");
start=s.nextInt();
System.out.println("enter the ending number");
end=s.nextInt();

for(int i=start;i<end;i++)
{
p=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
p=1;
}
if(p==0){
System.out.println(i);
}
}
}
}