import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size whatever you wants:");
        int s=sc.nextInt();
        int num[]=new int[s];

        System.out.println("Enter array data:");
        for(int i=0;i<s;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x=sc.nextInt();
        boolean found=false;

      // System.out.println("Array data is:");
       for(int i=0;i<num.length;i++)
       {
       
        if(num[i] == x)
        {
            System.out.println("X is present at:"+i);
            found =true;
        }
    }
        if(!found)
        {
            System.out.println("X is present in this array");
        }
        sc.close();
        
         
       }




    //    int marks[]=new int[5];//dynamic array
    //    int marks1[]={50,40,45};
    //    marks[0]=50; 
    //    marks[1]=40;
    //    marks[2]=45;
    //    for(int i=0;i<3;i++)
    //    {
    //      System.out.println(marks[i]);
    //    }
    //    System.out.println();

    //    for(int i=0;i<3;i++)
    //    {
    //      System.out.println(marks1[i]);
    //    }



    }

    
