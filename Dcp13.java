// //var example code

// public class Dcp13 
// {
//     public static void main(String[] args) 
//     {
//         int a = 7; 
//         var b = 9;          //we can use var keyword as datatype 

//         int c;                  
//         //var d;            //WE cannot use


//         int num[] = new int[5];
//         var nums = new int[4];         //we shpuld not use square brackett

//     }
// }









// //sealed classes example code

// sealed class A permits B,C 
// {
//     public void show()
//     {
//         int i = 9;
//         System.out.println(i);
//     }
// }
// sealed class B extends A permits D
// {

// }
// non-sealed class C extends A  
// {

// }
// final class D extends B
// {

// }
// final class E extends C
// {

// }

// public class Dcp13 
// {
//     public static void main(String[] args) 
//     {
//         E obj = new E();
//         obj.show();
//     }
// }











// //Record classes
// record students (int id , String name) {}
// public class Dcp13 
// {
//     public static void main(String[] args) 
//     {
//        students s1 = new students(01, "karthik");
//        students s2 = new students(02, "jhon");
        
//        System.out.println(s1 + "\n" + s2);

//     }
// }