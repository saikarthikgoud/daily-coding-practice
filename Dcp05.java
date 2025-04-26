// //class and object exampple code
// class calculator
// {
//     int a;
//     // public int add(int n1,int n2)
//     // {
//     //     int r = n1 + n2;
//     //     return r;
//     // }
//     public int sub(int n1 , int n2, int n3)
//     {
//         int r = n1 - n2 - n3;
//         return r;
//     }
// }


// public class Dcp05 
// {
//         public static void main(String[] args) 
//     {
//      int num1 = 23;
//      int num2 = 10;
//      int num3 = 16;

//      calculator calc = new calculator();
//      //int result = calc.add(num1 , num2);
//      int result = calc.sub(num1,num2,num3);
//      System.out.println(result);
//     }    
// }






// // method example code 
// class activity
// {
//     public void writecode()
//     {
//         System.out.println("writing code..");
//     }
        
//     public String output(boolean b)
//     {
//          if(b)
//          return "executed";
//          else
//          return "notexecuted";
    
//     }
// }

// public class Dcp05 
// {
//     public static void main(String[] args) 
//     {
//         activity obj = new activity();
//         obj.writecode();
//         String str = obj.output(false);
//         System.out.println(str);
//     }

    
// }






// //method overriding exampple code
// class calculator
// {
//     public int add(int n1 ,int n2 , int n3)
//     {
//         return n1 + n2 + n3;
//     }
//     public int add(int n1 , int n2)
//     {
//         return n1 + n2;
//     }
//     public double add(double n1 , int n2)
//     {
//         return n1 + n2;
//     }
// }

// public class Dcp05
// {
//     public static void main(String[] args) 
//     {
//         calculator calc = new calculator();
//         double r = calc.add(4.5, 10);
//         System.out.println(r);
//     }
// }




// //array example code
// public class Dcp05 
// {
//     public static void main(String[] args) 
//     {
//         // int nums[] = {3,4,5,6};
//         // nums[1]=9;
//         // System.out.println(nums[1]);
//         int num[] = new int [5];
//         num [0] = 0;
//         num [1] = 10;
//         num [2] = 20;
//         num [3] = 30;
//         num [4] = 0;
        
        
//         for(int i=0;i<=4;i++)
//         System.out.println(num[i]);
        
//     }

    
// }






// // Multidimensional array example code
// public class Dcp05 
// {
//     public static void main(String[] args) 
//     {
//         int num[][] = new int[3][4];

//         for(int i = 0; i < 3; i++)
//         {
//             for(int j = 0; j < 4; j++)
//             {
//                 num [i][j] =(int)(Math.random() * 100);
//             }
//         }

//         //traditional for loop
//         for(int i = 0; i < 3; i++)
//         {
//             for(int j = 0; j < 4; j++)
//             {
//                 System.out.print(num[i][j] + " ");
//             }
//             System.out.println();
//         }

//          //enhanced for loop
//          for(int n[] : num)
//          {
//             for(int m :n )
//             {
//                 System.out.print(m+ " ");
//             }
//             System.out.println();
//         }
//     }
// }













// //jaggad multidimensional  array example code

// public class Dcp5 
// {
//     public static void main(String[] args) 
//     {
//         int num[][] = new int[3][];                //jaggad array
//         num [0] = new int [4];
//         num [1] = new int [2];
//         num [2] = new int [5];


//         for(int i = 0; i < num .length; i++)
//         {
//             for(int j = 0; j < num [i].length; j++)
//             {
//                 num [i][j] =(int)(Math.random() * 10);
//             }
//         }

//          //enhanced for loop
//          for(int n[] : num)
//         {
//             for(int m :n )
//             {
//                 System.out.print(m+ " ");
//             }
//             System.out.println();
//         }
//     }
// }







// //3dimensional array example code
// public class Dcp5 
// {
//     public static void main(String[] args) 
//     {
//         int num[][][] = new int[3][3][3];    

//         for(int i = 0; i < num .length; i++)
//         {
//             for(int j = 0; j < num [i].length; j++)
//             {
//                 for(int k = 0 ; k < num [i][j].length; k++)
//                 {
//                     num [i][j][k] =(int)(Math.random() * 100);
//                 }
//             }
//         }

//          //enhanced for loop
//          for(int[][] o : num)
//         {
//             for(int[] n:o )
//             {
//                 for(int m:n)
//                 {
//                     System.out.print(m+ " "); 
//                 }
//                 System.out.println("");
//             }
//             System.out.println("-----");
//         }
//     }
// }






//arrau example code
// class student {
//     int rollno;
//     String name;
//     int marks;
// }

// public class Dcp5 {
//     public static void main(String[] args) {
//         student s1 = new student();
//         s1.rollno = 1;
//         s1.name = "sai";
//         s1.marks = 96;

//         student s2 = new student();
//         s2.rollno = 2;
//         s2.name = "ravi";
//         s2.marks = 91;

//         student s3 = new student();
//         s3.rollno = 3;
//         s3.name = "sri";
//         s3.marks = 89;

//         student[] students = new student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         for (int i = 0; i < students.length; i++) {
//             System.out.println(students[i].name + " " + students[i].marks);
//         }
//     }
// }



class student {
    int rollno;
    String name;
    int marks;
}

public class Dcp5 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "sai";
        s1.marks = 96;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "ravi";
        s2.marks = 91;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "sri";
        s3.marks = 89;

        student[] students = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(student stud : students)
        {
            System.out.println(stud.name + " " + stud.marks);

        }
   }
}



