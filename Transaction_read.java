import java.util.*; 
import java.io.*;
public class Transaction_read
{
  public static void main(String[] args)
  {
try
{
 List<String> s = new ArrayList<String>();
String aa="";
int b;
 File file = new File("D:\\Transaction.txt");
 
  BufferedReader br = new BufferedReader(new FileReader(file));
 
String st;
int count=0;
while ((st = br.readLine()) != null)
{
//System.out.println(st);
StringTokenizer t = new StringTokenizer(st);  
     while (t.hasMoreTokens()) {  
        s.add(t.nextToken());
}}


//TO DSIPLAY PRDCT DETAILS WITH DISCOUNT GREATER THAN 25%
int i=0;
while(i<3)
{

aa=s.get((8*i)+6);
int l=Integer.parseInt(aa);
if(l>25)
{
//System.out.println(l);
System.out.println("Displaying Product Details With Discount greater thn 25%");
int k=0;
while(k<7)
{
System.out.println(s.get((8*i)+k));
k++;
}}
i++;
}

//TO FIND THE HIGHEST PURCHASE MADE IN A DAY
String p;
int w=0,l=0;
int pp[]=new int[3];   
for(int g=0;g<3;g++)    //3-no. of rows/records
{p=s.get((8*g)+4); //8-No. of columns 4-4th column
pp[g]=Integer.parseInt(p);
}
for(int g=0;g<3;g++)
{if(pp[g]>w)
{
w=pp[g];
l=g;
}
}
System.out.println("The highest purchase is:"+ w);
System.out.println("Product details of highest purchase");
int x=0;
while(x<7)
{
System.out.println(s.get((8*l)+x));
x++;
}

//TOTAL PURCHASE MADE BY A CUSTOMER IN A YEAR

}



catch(Exception e)
{
System.out.println("message;"+e.getMessage());
}
}}

