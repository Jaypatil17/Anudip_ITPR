import java.util.*;
public class simple
{
  /*  public static int add(int a,int b)
    {
      int c=a+b;
      return c;
    }
     public static int mul(int a,int b)
    {
      int c=a*b;
      return c;
    }*/
     public static int div(int a,int b)
    {
      int c=a/b;
      return c;
    }

   
   /*  public static void main(String[] args)
    {
        simple s1= new simple();
        int d= s1.add();
        System.out.println(d);
        
    }*/
   /*   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st val");
        int a=sc.nextInt();
        System.out.println("Enter 1st val");
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println("this is addtion :"+sum);
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st val");
        int a=sc.nextInt();
        System.out.println("Enter 1st val");
        int b=sc.nextInt();
        int product=mul(a,b);
        System.out.println("this is multiplication :"+product);
    } */
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st val");
        int a=sc.nextInt();
        System.out.println("Enter 1st val");
        int b=sc.nextInt();
        int div=div(a,b);
        System.out.println("this is division :"+div);
        sc.close();
    }
}
