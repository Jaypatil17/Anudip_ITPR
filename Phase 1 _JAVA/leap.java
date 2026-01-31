import java.util.Scanner;
public class leap 
{
    public static void main(String[] args)
    {
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter year :");
           int year=sc.nextInt();
           if(year%4==0)
           {
             if(year%400==0)
             {
                System.out.println("Enetred year is leap year");
             }
             else
             {
                System.out.println("Enetred year is leap year");
             }
           }
           else
           {
            System.out.println("Enetred year is not leap year");
           }
           sc.close();
    }

    
}
