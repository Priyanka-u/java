import java.io.*;
import java.util.*;
class Transaction_write
{
public static void main(String[] args)
{
try
{
 List<String> s = new ArrayList<String>();
BufferedWriter f=new BufferedWriter(new FileWriter("D:\\Transaction.txt"));
String cid[]=new String[3];
String pid[]=new String[3];
int price[]=new int[3];
int quant[]=new int[3];
int tot[]=new int[3];
int dis[]=new int[3];
String date[]=new String[3];
String type[]=new String[3];

Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter Product Details");
System.out.println("enter ProdID");
pid[i]=sc.next();
System.out.println("enter Price");
price[i]=sc.nextInt();
System.out.println("enter Customer ID");
cid[i]=sc.next();
System.out.println("enter Quantity");
quant[i]=sc.nextInt();
System.out.println("enter date in format ddmmyyyy");
date[i]=sc.next();
System.out.println("enter totalprice");
tot[i]=sc.nextInt();
System.out.println("enter product type");
type[i]=sc.next();
System.out.println("enter Discount percentage out of 100");
dis[i]=sc.nextInt();
f.write(cid[i]+"\t"+pid[i]+"\t"+price[i]+"\t"+quant[i]+"\t"+tot[i]+"\t"+date[i]+"\t"+dis[i]+"\t"+type[i]);
f.newLine();
}
String st;


f.close();
}

catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}
}