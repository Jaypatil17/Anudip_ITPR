public class breakcontinue 
{
    public static void main(String[] args) 
    {
         //continue keyword

        for(int i=1;i<=10;i++)
        {
            if(i==4)
            {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        //break keyword
         for(int i=1;i<=10;i++)
        {
            if(i==4)
            {
                break;
            }
            System.out.println(i);
        }
     
    }

    
}
