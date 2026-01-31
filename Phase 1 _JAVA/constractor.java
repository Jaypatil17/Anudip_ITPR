public class constractor
{
    int x,y;
    public constractor(int a,int b)
    {
        x=a;
        y=b;
    }
  public static void main(String[] args) 
  {
     constractor c1 =new constractor(10,20 );
     System.out.println(c1.x + c1.y);
  }    
}
