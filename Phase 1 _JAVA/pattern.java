public class pattern
{
  public static void main(String[] args) 
  {
    int rows= 5;

      for(int i=1;i<=rows;i++)
     {
        for(int j=1;j<=i;j++)
        {
          System.out.print("*"+" ");
        }  
        System.out.println();
     }
/*   *
     * *
     *  * *
     * * * *
     * * * * * 
*/
     System.out.println();
     
     for(int i=1;i<=rows;i++)
     {
        for(int j=i;j<=rows-1;j++)
        {
          System.out.print("*"+" ");
        }  
        System.out.println();
     }
    /*  * * * *
        * * *
        * *
        *
   */ 

     System.out.println();

    int cols=5;
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=cols;j++)
        {
         System.out.print("*"+" ");
        }
        System.out.println();
    }
/*  * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 */
   System.out.println();

   for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=rows;j++)
        {
          if(i==1 || i==rows|| j==1|| j==rows)
          {
            System.out.print("*");
          }
          else
          {
           System.out.print(" ");
          }
         
        }
         System.out.println();
    }
  /*  ***** 
      *   *
      *   *  
      *   *
      *****      
  */
    System.out.println();

    for(int i=1; i<=rows; i++)
    {
      for(int j=1; j<=rows-i; j++)
      {
       System.out.print(" ");
      }
      for(int k=1; k<=i; k++)
      {
       System.out.print("* ");
      }
      System.out.println("");
    }
    /*
             *
            * *
           * * *
         * * * * *
        * * * * * *
     */
    System.out.println();

    for(int i=rows-1;i>=1;i--)
    {
      for(int j=1;j<=rows-i;j++)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=(2*i-1);k++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
    /*
       *******
        *****
         ***
          *
     */

     System.out.println();   
      
    int num=1;
    for(int i=1; i<=rows; i++)
    {
      for(int j=1; j<=i;j++)
      {
        System.out.print(num + " ");
        num++;
      }
      System.out.println("");
    } 
    /*
       1
       2 3
       4 5 6
       7 8 9 10
       11 12 13 14 15
    
    */ 
    System.out.println();
     
    
     

  }
}

