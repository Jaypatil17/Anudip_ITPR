import java.util.Scanner;
public class factorial 
{
     public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number:");
       int n =sc.nextInt();
       float f=1;
       for(int i=1;i<=n;i++)
       {
        f=f*i;
        System.out.println("Factorial num is"+f);
       }
       sc.close();
    }
}