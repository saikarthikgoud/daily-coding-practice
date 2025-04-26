//exception example code

// //compile time error 
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         System.out.Println();
//     }
// }


// //run time error
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         //int div = 5 / 0;                                  //error due to dividing with 0
//         //System.out.println("div");
        
//         int[] numbers = {1, 2, 3};                          //error due to wrong index
//         System.out.println(numbers[3]);
//     }
// }





// //logical error
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         // int sum = 2 - 3;                                        //sub done in the placa of sum
//         // System.out.println(sum);
        
//         int marks = 69;
//         if(marks > 90)
//             System.out.println("first class");
//         else if(marks > 70)
//             System.out.println("second class");
//         else                                                        //lessthan 50 marks is referred as fail but in this lessthan 70 is shown as fail
//             System.out.println("fail");                             //logiical error
            
//     }    
// }










// //exception handling using try catch 
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         int i = 0;
//         int j = 0;
//         try
//         {
//              j = 18/i;
//         }
//         catch(Exception e)
//         {
//             System.out.println("somthing went wrong");
//         }
//         System.out.println(j);
//     }
// }










// // try with multiple catch example code 
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         int i = 2;
//         int j = 0;
        
//         String str = "null";

//         int nums[] =new int [5];

//         try
//         {
//             j = 18/i;
//             System.out.println(j);

//             System.out.println(nums[1]);
//             System.out.println(nums[2]);
//             System.out.println(str.length());
//         }
//         catch( ArithmeticException e)
//         {
            
//             System.out.println("cannot divde with 0");
//         }
        
//         catch(ArrayIndexOutOfBoundsException e )
//         {
//             System.out.println("stay in thr limit of the index");
//         }
//         catch(Exception e)
//         {
//             System.out.println("something went wrong ");
//         }
//         // System.out.println(j);
//     }
// }










//exception throw keyword
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         int i = 20;
//         int j = 0;

//         try
//         {
//             j = 18/i;
//             if(j==0)
//                 throw new ArithmeticException ("i dont want to  zero print exception");   
//            // System.out.println(j);
//         }
//         catch( ArithmeticException e)
//         {
//             j = 18/1;
//             System.out.println("that is a default output   " +  e);
//             // System.out.println("cannot divde with 0");
//         }

//         catch(Exception e)
//         {
//             System.out.println("something went wrong ");
//         }
//         System.out.println(j);
//     }
// }


















// //custom exceptions 
// class karthikException extends Exception
// {
//     public karthikException(String string)
//     {
//         super(string);
//     }
// }
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         int i = 20;
//         int j = 0;

//         try
//         {
//             j = 18/i;
//             if(j==0)
//                 throw new karthikException ("i dont want to  zero");   
//            // System.out.println(j);
//         }
//         catch( karthikException e)
//         {
//             j = 18/1;
//             System.out.println("that is a default output   " +  e);
//             // System.out.println("cannot divde with 0");
//         }

//         catch(Exception e)
//         {
//             System.out.println("something went wrong ");
//         }
//         System.out.println(j);
//     }
// }


















// //ducking exception using throws
// class karthikException extends Exception
// {
//     public karthikException(String string)
//     {
//         super(string);
//     }
// }
// public class Dcp10 
// {
//     public static void main(String[] args) 
//     {
//         try
//         {
//             Class.forName("Dcp9");
//         }
//         catch(ClassNotFoundException e)
//         {
//             System.out.println("not able to find" + e);
//         }        
//         int i = 2;
//         int j = 0;

//         try
//         {
//             j = 18/i;
//             if(j==0)
//                 throw new karthikException ("i dont want to  zero");   
//            // System.out.println(j);
//         }
//         catch( karthikException e)
//         {
//             j = 18/1;
//             System.out.println("that is a default output   " +  e);
//             // System.out.println("cannot divde with 0");
//         }

//         catch(Exception e)
//         {
//             System.out.println("something went wrong ");
//         }
//         System.out.println(j);
//     }
// }






// //other example of ducking exception using throws
// class A 
// {
//     public void show() throws ClassNotFoundException
//     {
//         Class.forName("Dcp9");

//     }
// }

// public class Dcp10 {

//     static
//     {
//         System.out.println("class loaded");
//     }

//     public static void main(String[] args) 
//     {
//         A obj = new A();
//         try {
//             obj.show();
//         } catch (ClassNotFoundException e) {
          
//             e.printStackTrace();
//         }
//     }
// }













// //user input using bufferreader and scanner

// import java.io.IOException;
// import java.util.Scanner;

// public class Dcp10 
// {
//     public static void main(String[] args) throws IOException 
//     {
//         System.out.println("enter a no");

//         // InputStreamReader in =new InputStreamReader(null);
//         // BufferedReader bf = new BufferedReader(in);

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println(num);

//         sc.close();
        
    
//     }    
// }













//try with resourses 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dcp10 
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        int num = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }   
    }    
}