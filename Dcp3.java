// // if example code
// public class dcp3 
// {
//     public static void main(String[] args) 
//     {
//         double d = 70.8;

//         if(d > 70)                       //if it is true print
//         System.out.println("executed");
//     }    
// }








// //if else example code
// public class dcp3 
// {
//     public static void main(String[] args) 
//     {
//         // int x = 20;

//         // if(x > 10 && x == 20)                         //if it is true print if not move to else codition
//         // System.out.println("hello");
//         // else                                          r/if it is true print if not return erroe
//         // System.out.println("bye");  

//         //int x = 18;
//         int x = 7;
//         int y = 16;

//         if(x > y)
//         {    
//             System.out.println("thankyou");
//             System.out.println(x);
//         }   
//         else
//         {
//             System.out.println("bye");
//             System.out.println(y);
//         }
//     }
// }







// // if else if example code
// public class dcp3 
// {
//     public static void main(String[] args) 
//     {
//         double x = 4667.38;
//         int y = 46679;
//         int z = 46677;

//         if(x >y && x > z)
//             System.out.println("x is greater");
//         else if(y > x && y > z)
//             System.out.println("y is greater");
//         else
//             System.out.println("z is greater");    
//     }
// }







// // ternary operator code
// public class dcp3 
// {
//     public static void main(String[] args) 
//     {
//         // //int n = 10;
//         // int n = 9;
//         // String result = "";
        
//         // if(n % 2==0)
//         //     result = "number verified";
//         // else
//         //     result = "number spam";
//         // System.out.println(result);


//         //int n = 8;
//         int n =7;
//         boolean result;

//         result = n % 2 == 0 ? true : false;
//         System.out.println(result);
//     }
// }




// // switch statement example code
// public class dcp3 
// {
//     public static void main(String[] args) 
//     {
//         //int n = 7;
//         int n = 8;
//         switch(n)
//         {
         
//             case 1:
//                 System.out.println("monday");
//                     break;
//             case 2:
//                 System.out.println("tuesday");
//                     break;
//             case 3:
//                 System.out.println("wednesday");
//                     break;
//             case 4:
//                 System.out.println("thursday");
//                     break ;
//             case 5:
//                 System.out.println("friday");
//                     break;
//             case 6:
//                 System.out.println("saturday");
//                     break;
//             case 7:
//                 System.out.println("sunday");
//                     break;
//             default:
//                 System.out.println("enter a valid number");
//         }
//     }    
// }





// switch statement latest example code
public class dcp3 
{
    public static void main(String[] args) 
    {
        String day = "monday";
        String result = "";

        result = switch(day)
        {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> "5am";
            case "saturday" -> "6am";
            case "sunday" -> "7am";
            default -> "invalid";
        };
        System.out.println(result);
    }

}