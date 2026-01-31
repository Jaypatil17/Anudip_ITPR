public class Pattern2
{
   public static void main(String [] args) 
   {
    for(int i=1;i<=4;i++)
    { 
        for(int j=1;j<=5;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println("");
    }


    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    System.out.println();

    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1||j==1||i==4||j==5)
            {
                System.out.print("*"+" ");
            }
            else
            {
                System.out.print("  ");;
            }
        }
        System.out.println();
    }

    // * * * * *
    // *       *
    // *       *
    // * * * * *

    System.out.println();

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * * 

    System.out.println();

    for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    System.out.println();

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    //     *
    //    **
    //   ***
    //  ****
    // *****

    System.out.println();

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
//         *
//        * *
//      *  *  *
//     *  *  *  * 
//    *  *  *  *  *

System.out.println();

 for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
//    *  *  *  *  *
//     *  *  *  *
//       *  *  *
//         *  *
//           *

System.out.println();

for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
System.out.println();

for(int i=1;i<=5;i++)
{
    for(int  j=1;j<=i;j++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

System.out.println();

for(int i=5;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

System.out.println();

for(int i=5;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(i+" ");
    }
    System.out.println();
}
// 5 5 5 5 5
// 4 4 4 4
// 3 3 3
// 2 2
// 1
System.out.println();
int n=1;
for(int i=1;i<=5;i++)
{ 
    for(int j=1;j<=i;j++)
    {
        System.out.print(n+" ");
        n++;
    }
    System.out.println();
}
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

System.out.println();

for(int i=1;i<=5;i++)
{ 
    for(int j=1;j<=i;j++)
    {  
        int sum=i+j;
        if(sum%2==0)
        {
            System.out.print("1 ");
        }
        else
        {
            System.out.print("0 ");
        }
    }
    System.out.println();
}
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
System.out.println();

     for(int i=1;i<=5;i++)
     {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=5;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
     }
    //           * * * * *
    //         * * * * *
    //       * * * * *
    //     * * * * * 
    //   * * * * * 

    System.out.println();

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print( i +" ");
        }
        System.out.println();
    }   
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
    System.out.println();
     
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--)
        {
          System.out.print(j);
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    //      1
    //     2 1
    //    2 1 2
    //   3 2 1 2 3
    //  4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    System.out.println();

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        
    }
      for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=5-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        
    }
//         *
//        * *
//      *  *  *
//     *  *  *  * 
//    *  *  *  *  *
//    *  *  *  *  *
//     *  *  *  *
//       *  *  *
//         *  *
//           *

    }        

}


