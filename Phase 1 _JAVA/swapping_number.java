import java.util.*;
class swapping_number
{
   swapping_number(int a,int b)
   {
    int x=a;
    int y=b;
   }
   public void swapping()
   {
    System.out.println("Values before swapping::"+x +"\n" +y);
    int temp=x;
    x=y;
    y=temp;
    System.out.println("Values after swapping::"+x+ "\n" +y);
   }
}
public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     swapping_number s1=new swapping_number(10, 20);
     s1.swapping();
   }
