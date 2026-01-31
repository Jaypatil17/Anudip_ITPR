 interface Animal 
{
   public void walk();
   public void eat();
    
}
 interface Cat
 {
   public void meow();
    
}
class Dog implements Animal,Cat
{
  public void walk()
  {
    System.out.println("Child class");
  }
   public void eat()
  {
    System.out.println("Child class");
  }
  public void meow()
  {
    System.out.println("cat class");
  }
}
public class Interface
{
  public static void main(String[] args)
  {
   Dog d1=new Dog();
   d1.walk();
   d1.eat();
   d1.meow();
  }
    
}

