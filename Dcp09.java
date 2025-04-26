// //interface example code
// interface car 
// {
//     //variables are final and static cannot be changed
//     int cost = 10000;
//     String s = "bmw";
    
    
//     void start();
//     void drive();
// }

// class Bmw implements car
// {
//     public void start()
//     {
//         System.out.println("starting");
//     }
//     public void drive()
//     {
//         System.out.println("driving");
//     }
// }
// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         car obj;
//         obj = new Bmw();
//         obj.start();
//         obj.drive();

//     }    
// }







// //need of interface example code
// interface computer
// {
//     void code();
// }

// class laptop implements computer
// {
//     public void code()
//     {
//         System.out.println("code : compile : run");
//     }
// }

// class desktop implements computer
// {
//     public void code()
//     {
//         System.out.println("code : compile : run : faster");
//     }
// }

// class developer 
// {
//     public void devapp(computer comp)
//     {
//         comp.code();
//     }
// } 

// public class Dcp09
// {
//     public static void main(String[] args)
//     {
        
//         computer lap = new laptop();
//         computer desk = new desktop();

//         developer sai = new developer();
//         sai.devapp(lap);
//     }
// }










// //more example interface code 


// //class - class -> extends
// //class - interface -> implement
// //interface - interface -> extends
// interface car 
// {
//     //variables are final and static cannot be changed
//     int cost = 10000;
//     String s = "bmw";
    
    
//     void start();
//     void drive();
    
// }


// interface x
// {
//     void run();
// }


// interface y extends x
// {

// }

// class Bmw implements car,y
// {
//     public void start()
//     {
//         System.out.println("starting");
//     }
//     public void drive()
//     {
//         System.out.println("driving");
//     }
//     public void run()
//     {
//         System.out.println("running");
//     }
// }
// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         car obj;
//         obj = new Bmw();
//         obj.start();
//         obj.drive();
//         x obj1 = new Bmw();
//         obj1.run();

//     }    
// }







// //enum example code 
// enum days
// {
//     monday,tuesday,wednesday,thursday,friday,saturday,sunday;
// }
// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         // day today = day.monday;
//         // System.out.println(today);
        
//         days [] today = days.values();
//         for(days day: today)
//         {
//             System.out.println(day + ":" + day.ordinal());
//         }
//     }
// }










// //enum with if and switch example code
// enum day
// {
//     monday,tuesday,wednesday,thursday,friday,saturday,sunday;
// }
// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         day today = day.saturday;
//         switch(today)
//         {
//             case sunday:
//                 System.out.println("rest day");
//                 break;
//             case saturday:
//                 System.out.println("how works to be done");
//                 break;
//             case monday:
//                 System.out.println("office work");
//                 break;
//             case tuesday:
//                 System.out.println("office work");
//                 break;
//             case wednesday:
//                 System.out.println("office work");
//                 break;
//             case thursday:
//                 System.out.println("office work");
//                 break;
//             case friday:
//                 System.out.println("office work");
//                 break;
//         }
//         // if(today == day.sunday)
//         //     System.out.println("rest day");
//         // else if(today == day.saturday)
//         //     System.out.println("home works to be done ");
//         // else 
//         //     System.out.println("go to office ");
//     }
// }














// //enum class example code
// enum laptop
// {
//     mac(5000),dell(4000),hp,asus(4500);

//     private int price;

//     private laptop() 
//     {
//         price = 500;
//     }

//     private laptop(int price) 
//     {
//         this.price = price;
//         System.out.println("in laptop " + this.name());
//     }

//     public int getPrice() {
//         return price;
//     }

//     public void setPrice(int price) {
//         this.price = price;
//     }
    
    
// }
// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         // laptop lap = laptop.mac;  
//         // lap.setPrice(5003);
//         // System.out.println(lap + ":" + lap.getPrice());  
        
//         for(laptop lap : laptop.values())
//         {
//             System.out.println(lap + ":" + lap.getPrice());
//         }
//     }
// }













// //annotation example code 
// class A 
// {
//     public void code()
//     {
//         System.out.println("coding");
//     }
// }

// class B extends A
// {
//     @Override
//     public void code()
//     {
//         System.out.println("compileing");
//     }
// }

// public class Dcp09 
// {
//     public static void main(String[] args)
//     {
//         B obj = new B();
//         obj.code();
//     }
// }









////funtional interface example code
// @FunctionalInterface
// interface A 
// {
//     void code();
// }

// // class B implements A 
// // {
// //     public void code()
// //     {
// //         System.out.println("codeing");
// //     }
// // }

// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         A obj = new A()
//         {
//             public void code()
//             {
//                 System.out.println("codeing  DONE");
//             }
//         };
//         obj.code();
//     }
// }












//lambda expression example code without lambda expression 
// @FunctionalInterface
// interface A 
// {
//     void code();
// }


// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         A obj = () -> System.out.println("codeing "); 
//         obj.code();
//     }
// }



//lambda expression example code with lambda expression 

// @FunctionalInterface
// interface A 
// {
//     void code(int i);
// }

// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         // A obj = (i) -> System.out.println("codeing " + i); 
//         A obj = i -> System.out.println("codeing " + i); 

//         obj.code(6);
//     }
// }











// //lambda expression with return example code without lambda expression
// @FunctionalInterface
// interface A 
// {
//     int add(int i , int j);
// }

// public class Dcp09 
// {
//     public static void main(String[] args) 
//     {
//         A obj = new A() 
//         {
//             public int add(int i , int j)
//             {
//                 return i + j;
//             }
//         };
//         int result = obj.add(5, 7);
//         System.out.println(result);
//     }
// }






//lambda expression with return example code with lambda expression
@FunctionalInterface
interface A 
{
    int add(int i , int j);
}

public class Dcp09 
{
    public static void main(String[] args) 
    {
        A obj = ( i , j) ->  i + j;
       
        int result = obj.add(5, 7);
        System.out.println(result);
    }
}
