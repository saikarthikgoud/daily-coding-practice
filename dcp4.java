// //while loop example code
// public class dcp4
// {
//     public static void main(String[] args) 
//     {
//         int i = 1;
//         while(i<=5)
//         {
//         System.out.println("hello");
//         System.out.println("welcome");
//         i++;
//         }
//     }    
// }




// //nested while loop example code
// public class dcp4 
// {
//     public static void main(String[] args) 
//     {
//         int i = 1;
//         while(i<=5)
//         {
//             System.out.println("hello ");
//             int j = 1;
//             while(j<=2)
//             {
//                 System.out.println("welcome ");
//                 System.out.println("sir");
//                 j++;
//             }
//             i++;
//         }        
//     }
// }






// //do while loop example code
// public class dcp4 
// {
//     public static void main(String[] args) 
//     {
//         int i = 5;
//         do
//         {
//             System.out.println("executed");
//         }
//         while(i<=4);   
//     }
// }



// // for loop example code
// public class dcp4 
// {
//     public static void main(String[] args) 
//     {
//         //for(int i = 0;i<=4;i++)
//         for(int i = 5;i>=0;i--)

//         {
//             System.out.println("working " + i);
//         }
//     }    
// }




//for loop example code 2
public class dcp4
{
    public static void main(String[] args) 
    {
        for(int i = 1;i<=2;i++)
        {
            System.out.println("DAY " + i);
            for(int j = 0;j<=22;j++)
            {
                System.out.println(" " + (j+1) + " - " + (j+2));
            }
        }
    }
}