import java.util.Scanner;

public class Leap
{
    public static void main(String args[])
    {
       int yr;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter Year : ");
       yr = s.nextInt(); 
if((yr%400==0)||((yr%4==0)&&(yr%100!=0))) 
{
System.out.print(yr+" is a leap year");
}
else
{
System.out.print(yr+" is not a leap year");
}
}
}
