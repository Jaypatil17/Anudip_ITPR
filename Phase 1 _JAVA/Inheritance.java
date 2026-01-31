class demo 
{
  int a=20;
  int b=30;
  void add()
  {
    int mul=a*b;
    System.out.println("Multiplication is :"+mul);
  }  
}
 
class demo2 extends demo
{
  void mul()
  {
     int sum=a+b;
     System.out.println("Addition is :"+sum);
  }
}
public class Inheritance
{
  public static void main(String[] args) 
  {
    demo2 d1=new demo2();
    d1.mul();
    d1.add();
  }    
}
