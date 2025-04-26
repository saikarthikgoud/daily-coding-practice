// //access modifiers example code



// // package other;

// // public class a 
// // {
// //     //public int marks = 6;                               //public anywherwe  
// //     //private int marks = 7;                              //private only with in the class 
// //     //int marks = 8;                                      //defaut only with the same package
// //    // protected int marks = 9;                            //same package same subclss
// // }




// //package other;

// // public class b {
// //     //public int name;                            //public anywherwe    
// //     //private int name;                           //private only with in the class                       
// //     //int name;                                   //defaut only with the same package 
// //     protected int name;                         //same package same subclss

// // }





// import other.*;
// public class Dcp08 
// {
//     public static void main(String[] args) 
//     {
//         a obj = new a();
//         System.out.println(obj.marks);
//         b obj1 = new b();
//         System.out.println(obj1.name);


//     }
// }








// //dynamic method dispatch example code 

// class A
// {
//     public void show()
//     {
//         System.out.println("in A show");
//     }
// }
// class B extends A
// {
//     public void show()
//     {
//         System.out.println("in B show");
//     }
// }
// class C extends A
// {
//     public void show()
//     {
//         System.out.println("in C show ");
//     }

// }
// public class Dc0p8 
// {

//     public static void main(String[] args) 
//     {
//         A obj = new A();
//         obj.show();

//         obj = new B();
//         obj.show();

//         obj = new C();
//         obj.show();

//     }
// }








//final keyword variable example code 

// public class Dcp08 
// {
//     public static void main(String[] args) 

//     {
//         // //without final keyword
//         // int num = 10;
//         // num = 9;
//         // System.out.println(num); 
        
//         //with final keyword value cannot be changed again 
//         final int num = 10;
//         //num = 9;
//         System.out.println(num);  
//     }    
// }



// //final keyword method  and classexample code 
// //final class calc
// class calc
// {
//     //final method
//     public final void show()
//     {
//         System.out.println("BY BSK");
//     }
//     public void add(int a , int b)
//     {
//         System.out.println(a+b);
//     }
// }
// class advcalc extends calc
// {
//     // public void show()
//     // {
//     //     System.out.println("BY JHON");
//     // }
// }


// public class Dcp08 
// {
//     public static void main(String[] args) 
//     {
//         advcalc obj = new advcalc();
//         obj.show();
//         obj.add(4, 7);
//     }   
// }








// //object class equals tostring hashcode example code 
// class laptop
// {
//     String model;
//     int prize;

//     // public String toString()
//     // {
//     //     return model + ":" + prize;
//     // }

//     @Override
//     public String toString() {
//         return "laptop [model=" + model + ", prize=" + prize + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((model == null) ? 0 : model.hashCode());
//         result = prime * result + prize;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         laptop other = (laptop) obj;
//         if (model == null) {
//             if (other.model != null)
//                 return false;
//         } else if (!model.equals(other.model))
//             return false;
//         if (prize != other.prize)
//             return false;
//         return true;
//     }

    
//     // public boolean equals(laptop that)
//     // {
//     //     return this.model.equals(that.model)&& this.prize ==that.prize;
//     // }
// }
// public class Dcp08 
// {
//     public static void main(String[] args) 
//     {
//         laptop obj = new laptop();
//         obj.model = "dell lattitude";
//         obj.prize = 18000;
        

//         laptop obj1 = new laptop();
//         obj1.model = "dell lattitude";
//         obj1.prize = 18000;

//         boolean result = obj.equals(obj1);
//         System.out.println(result);
//     }

// }









// //upcasting and downcasting example code

// class A 
// {
//     public void first()
//     {
//         System.out.println("in A first");
//     }
// }
// class B extends A
// {
//     public void second()
//     {
//         System.out.println("in B second");
//     }
// }


// public class Dcp08 
// {
//     public static void main(String[] args) 
//     { 
        
//         //upcasting
//         A obj = new B();
//         obj.first();
        
//         //downcasting
//         B obj1 = (B) obj;
//         obj1.second();
//     }    
// }










// //wrapper class  example code
// public class Dcp08 
// {
//     public static void main(String[] args) 
//     {
//         int num = 9;
//         Integer num1 = num +1;                //autoboxing
//         int num2 = num1 + 2;                    //auto unboxing


//         System.out.println(num + ": " + num1 + " : " + num2);

//         String str = "12";
//         int num3 = Integer.parseInt(str);
//         System.out.println(num3);
        
//     }
// }











// // abstract keywoed example code
// abstract class car
// {
//     public abstract  void drive();
   
//     public void playmusic()
//     {
//         System.out.println("play music");
//     }
// }


// class bmw extends car                         //concrete class
// {
//     public void drive()
//     {
//         System.out.println("driving");
//     }
// }
// public class Dcp08 
// {
//     public static void main(String[] args) 
//     {
//         car obj = new bmw();
//         obj.drive();
//         obj.playmusic();
        
//         System.out.println(obj);
    
//     }    
// }




// //inner class example code
// class A 
// {
//     int age;

//     public void outer()
//     {
//         System.out.println("in outer");
//     }
    

//     class B
//     //static class B 
//     {
//         public void inner()
//         {
//             System.out.println("in inner");
//         }
//     }

// }

// public class Dcp08 
// {
//     public static void main(String[] args)
//     {
//         A obj = new A();
//         obj.outer();


//         A.B obj1 = obj.new B();
//         //A.B obj1 = new A.B();
//         obj1.inner();
//     }
// }










//// anonymous inner class
// class A 
// {
//     public void show()
//     {
//         System.out.println("in A show");
//     }
// } 
// // class B extends A 
// // {
// //     public void show()
// //     {
// //         System.out.println("in B show");
// //     }
// // } 
// public class Dcp08 
// {
//     public static void main(String[] args)
//     {
//         A obj = new A()
//         {
//             //anonymous class
//             public void show()
//             {
//                 System.out.println("in new show");
//             }
//         };
//         obj.show();   
//     }
// }









//abstract and anonymous inner class
abstract class A 
{
    public abstract  void show();
} 


// class B extends A
// {
//     public void show()
//     {
//         System.out.println("in B show");
//     }
// }


public class Dcp08 
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void show()
                {
                    System.out.println("in new show");
                }
        };
        obj.show();   
    }
}
