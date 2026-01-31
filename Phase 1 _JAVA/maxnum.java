import java.util.Scanner;
public class maxnum
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println("The max num is"+n1);
            }
            else
            {
                System.out.println("The max num is"+n3);
            }
        }
        else
        {
            System.out.println("The max num is"+n2);
        }
        sc.close();
    }
}