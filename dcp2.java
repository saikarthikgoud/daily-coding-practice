// //arthmetic operators example code
// public class dcp2 
// {
//     public static void main(String[] args) 
//     {
//             int num = 10;
//             int num2 =12;
//             //int result = num + num2;               //addition
//             //int result = num - num2;               //subtraction
//             //int result = num % num2;               //remainder
//             //int result = num * num2;               //multiplication
//             //int result = num / num2;               //division
//             //num = num + 1;
//             //num++;
//             //++num;
//             //num--;
//             //--num;
//             // int result = num ++;                     //post increment
//             // System.out.println(result);
           
//             // int result2 = ++num;                     //pre increment
//             // System.out.println(result2);
           
//             // int result3 = num--;                     //post derement 
//             // System.out.println(result3);
           
//             int result4 = --num;                     //pre decrement
//             System.out.println(result4);
//     }    
// }





// //relational opertors example code
// public class dcp2 
// {
//     public static void main(String[] args) 
//     {
//         //int x = 7;
//         //int y = 9;
//         //double y = 7.5;

//         //boolean result = x < y;
//         //boolean result = x > y;
        
//         int x = 5;
//         int y = 5;
//         //int y = 7;
//         //double y = 7.7;
//         //boolean result = x <= y;
//         //boolean result = x >= y;
//         //boolean result = x != y;
//         boolean result = x == y;

//         System.out.println(result);
//         }
// }



//logical operators example code
public class dcp2 {

    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        int a = 8;
        int b = 5;

        //and
        //boolean result = x < y && a > b;
        //boolean result = x < y && a < b;
        //boolean result = x < y && a > b && y < 7.7;
        
        //or 
        //boolean result = x > y || a < b;
        //boolean result = x < y || a > b;
        boolean result = x < y || a > 8.9 || a > b;

        System.out.println(result);

        //not
        System.out.println(!result);


    }
}