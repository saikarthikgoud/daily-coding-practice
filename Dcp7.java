

//     //default constructor 
//     public human()
//     {
//         age = 10;
//         name = "java";
//     }
//     //parameterized constructor
//     public human(String n , int a)
//     {
//         age = a;
//         name = n;
//     }
    
//     //getters and setters with this keyword
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
// }

// public class Dcp7
// {
//     public static void main(String[] args) 
//     {
//         human obj = new human();
//         human obj1 = new human("sai", 12);
        
//         // obj.setAge(10);
//         // obj.setName("sai");
//         System.out.println(obj.getAge() + " : " + obj.getName());
//         System.out.println(obj1.getAge() + " : " + obj1.getName());
//     } 
// }






// // anonymus object example code
// class A
// {
//     public void show()
//     {
//         System.out.println("in A show");
//     }
// }

// public class Dcp7 
// {
//     public static void main(String[] args) 
//     {
//         //A obj = new A();
//         new A().show();                     //anonymous object
//     }
// }









// //single level inheritance example code
// class Calc
// {
//     public int add(int n1 ,int n2)
//     {
//         return n1 + n2;
//     }
//     public int sub(int n1 , int n2)
//     {
//         return n1 - n2;
//     }
// }



// class Advcalc extends Calc
// {
//     public int multi(int n1 ,int n2)
//     {
//         return n1 * n2;
//     }
//     public int div(int n1 , int n2)
//     {
//         return n1 / n2;
//     }
// }




// public class Dcp7 
// {
//         public static void main(String[] args) 
//         {
//             Advcalc obj = new Advcalc();
//             int r1 = obj.add(2, 2);
//             int r2 = obj.sub(3 , 1);
//             int r3 = obj.multi(4, 2);
//             int r4 = obj.div(6, 2);

//             System.out.println(r1 +":" + r2 + ":" + r3 + ":" +  r4);
//         }
// }










// //multi level inheritance example code
// class Calc
// {
//     public int add(int n1 ,int n2)
//     {
//         return n1 + n2;
//     }
//     public int sub(int n1 , int n2)
//     {
//         return n1 - n2;
//     }
// }



// class AdvCalc extends Calc
// {
//     public int multi(int n1 ,int n2)
//     {
//         return n1 * n2;
//     }
//     public int div(int n1 , int n2)
//     {
//         return n1 / n2;
//     }
// }



// class veryAdvCalc extends AdvCalc
// {
//     public double power(int n1 ,int n2)
//     {
//         return Math.pow(n1, n2);
//     }

// }





// public class Dcp7 
// {
//         public static void main(String[] args) 
//         {
//             veryAdvCalc obj = new veryAdvCalc();
//             int r1 = obj.add(2, 2);
//             int r2 = obj.sub(3 , 1);
//             int r3 = obj.multi(4, 2);
//             int r4 = obj.div(6, 2);
//             double r5 = obj.power(4, 2);

//             System.out.println(r1 +":" + r2 + ":" + r3 + ":" +  r4 + ":" + r5);
//         }
// }









// //this and super keyword example code
// class A                        //superclass
// {
//     public A()
//     {
//         super();
//         System.out.println("IN A");
//     }
//     public A(int n)
//     {
//         super();
//         System.out.println("IN A int ");
//     }
// }

// class B extends A                       //subclss
// {
//     public B()
//     {
//         super();
//         System.out.println("IN B");
//     }
//     public B(int n)
//     {
//         this();                   //thiskeyword
//         System.out.println("IN B int");
//     }
// }


// public class Dcp7 
// {
//     public static void main(String[] args) 
//     {
//         B obj = new B(5);
//     }    
// }







// //method overriding exmple code
// class A 
// {
//     public void show()
//     {
//         System.out.println("in show");
//     }
//     public void air()
//     {
//         System.out.println("in air");
//     }
// }
// class B extends A 
// {
//     public void show()
//     {
//         System.out.println("in show1");
//     }
// }

// public class Dcp7 
// {
//     public static void main(String[] args) 
//     {
//         B obj = new B();
//         obj.show();
//         obj.air();

//     }
// }







//method overriding example code 
class Calc
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
}

class AdvCalc extends Calc
{
    public int add(int n1 , int n2)
    {
        return n1 + n2 + 1;
    }
}
public class Dcp7 
{
    public static void main(String[] args) 
    {
        AdvCalc obj = new AdvCalc();
        int r1 =obj.add(4, 8);
        System.out.println(r1);
    }
}

