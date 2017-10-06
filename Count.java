import java.util.Scanner;

 class Count
{
    public static void main(String args[])
    {
        int n,a=0,b=0,z=0;
int d[]=new int[50];
        Scanner s = new Scanner(System.in);
System.out.println("how many numbers do u want??");
n=s.nextInt();
System.out.println("enter numbers");
for(int i=0;i<n;i++)
{
d[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(d[i]<0)
{
a++;
}
if(d[i]>0)
{
b++;
}
if(d[i]==0)
{
z++;
}
}
System.out.println("positive numbers:" +b);
System.out.println("negative numbers:" +a);
System.out.println("zeroes :" +z);
}
}



 