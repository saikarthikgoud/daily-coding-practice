// // Multiple Threads exapmple code
// class A extends Thread
// {
//     public void run()
//     {
//         for(int i = 0;i <= 10 ; i++)
//         {
//             System.out.println("hi");
//         }
//     }
// }

// class B extends Thread
// {
//     public void run()
//     {
//         for(int i = 0;i <= 10 ; i++)
//         {
//             System.out.println("hi");
//         }
//     }
// }
// public class Dcp11 
// {
//     public static void main(String a[] ) 
//     {
//         A obj = new A();
//         B obj1 = new B();
//         obj.start();
//         obj1.start();
//     }
// }











// //thread priority and sleep
// class A extends Thread
// {
//     public void run()
//     {
//         for(int i = 0;i <= 10 ; i++)
//         {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread
// {
//     public void run()
//     {
//         for(int i = 0;i <= 10 ; i++)
//         {
//             System.out.println("hello ");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// public class Dcp11 
// {
//     public static void main(String a[] ) 
//     {
//         A obj = new A();
//         B obj1 = new B();

//         obj1.setPriority(Thread.MIN_PRIORITY);
//         obj.start();
//         try {
//             Thread.sleep(10);
//         } catch (Exception e) {
//         }
//         obj1.start();
//     }
// }





















//runnable vs thread example code

// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i = 1;i <= 5 ; i++)
//         {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B implements Runnable
// {
//     public void run()
//     {
//         for(int i = 1;i <= 5 ; i++)
//         {
//             System.out.println("hello ");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// public class Dcp11 
// {
//     public static void main(String a[] ) 
//     {
//         Runnable obj = () -> 
//         {
//             for(int i = 1;i <= 5 ; i++)
//             {
//                 System.out.println("hi");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }            
//         };
//         Runnable obj1 = () -> 
//         {
//             for(int i = 1;i <= 5 ; i++)
//             {
//                 System.out.println("hello ");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         } ;

//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj1);

//         t1.start();
       
//         t2.start();
//     }
// }










//race condition example code 
class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
public class Dcp11 
{
    public static void main(String a[] ) throws InterruptedException 
    {
        Counter c = new Counter();
        Runnable obj = () -> 
        {
            for(int i = 1;i <= 1000 ; i++)
            {
                 c.increment();     
            }
        } ;
        Runnable obj1 = () -> 
        {
            for(int i = 1;i <= 1000 ; i++)
            {
                 c.increment();    
            }
        } ;

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
       
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}