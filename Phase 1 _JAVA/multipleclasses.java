public class multipleclasses
{
    public static void main(String[] args)
    {
        System.out.println("This one is main class");
        simple s1=new simple();
        demo d1=new demo();
        s1.disp();
        d1.disp1();
        
    }
}
class simple
{
    public void disp()
    {
       System.out.println("this one is from simple class");
    }
    
}
class demo
{
    public void disp1()
    {
       System.out.println("this one is from demo class");
    }
    
}

