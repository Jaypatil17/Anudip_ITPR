import java.util.*;
public class excepn
{
  public static void main(String[] args)    
  {
    excepn d=new excepn();
    d.disp();
  }


    public void disp() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        try
        {
            float c=a/b;
            System.out.println("Division is:"+c);
        }catch(ArithmeticException e)
        {
            System.err.println(e.getMessage());
        }
        sc.close();
    }
  }
