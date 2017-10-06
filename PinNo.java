import java.util.Scanner;
  class PinNo 
    {
  public static void main(String args[])

    {
  int m, n, sum = 0,q=0;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter the number:");
  m = s.nextInt();
  q=m;
  while(m > 0)
    {
   n = m % 10;
   sum = sum + n;
   m = m / 10;
    }
   System.out.print("Sum of Digits:"+sum);
   String e="Anu";
   char c=e.charAt(0);
   char d=e.charAt(e.length()-1);
   System.out.print(c);
   System.out.print(d);
   int f=q%10;
   switch(f)
  {
  case 0:
  {
  System.out.print('@');
  break;
  }
  case 1:
 {
  System.out.print('.');
  break;
 }
  case 2:
 {
 System.out.print(',');
 break;
 }
 case 3:
 {
 System.out.print('!');
 break;
 }
 case 4:
 { 
 System.out.print('>');
 break;
 }
 case 5:
 { 
 System.out.print('<');
 break;
 }
 case 6:
 {
 System.out.print('#');
 break;
 }
 case 7:
 {
 System.out.print('$');
 break;
 }
 case 8:
 {
 System.out.print('%');
 break;
 }
 case 9:
 {
 System.out.print('=');
 break;
 }
 default:
 {
 System.out.print("error");
 break;
 }
 }
 }
 }