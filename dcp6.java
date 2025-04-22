////string example code
// public class dcp6 
// {
//     public static void main(String[] args) 
//     {
//         String name = new String("karthik");
//         System.out.println("hello " + name );

//         String names = "karthik";
//         System.out.println("hello " + names.concat( " goud"));
        
//     }
// }






// // stringbuffer example code 
// public class dcp6 
// {
//     public static void main(String[] args) 
//     {
//         StringBuffer sb = new StringBuffer("HELLO ");
//         sb.append("karthik");
//         sb.append("\nwelcome karthik");
//         //sb.deleteCharAt(3);
//         System.out.println(sb);
        
//     }   
// }








// // //stringbuilder example code
// // public class dcp6 
// // {
// //     public static void main(String[] args) 
// //     {
// //         StringBuilder  sb = new StringBuilder("karthik");

// //         sb.append(" welcome");
// //         System.out.println(sb);

// //         sb.insert(0 ,"lets start ");
// //         System.out.println(sb);
// //     }    
// // }







// //static variable example code 
// class classroom
// {
//     String name;
//     int rollno;
//     String section;
//     double marks;

//     public void show()
//     {
//         System.out.println(name + ": " + rollno + ": " + section + ": " + marks);
//     }
// }
// public class dcp6 
// {
//     public static void main(String[] args) 
//     {
//         classroom s1 = new classroom();
//         s1.name = "karthik";
//         s1.rollno = 101;
//         s1.section = "cse";
//         s1.marks = 95.6;

//         classroom s2 = new classroom();
//         s2.name = "sai";
//         s2.rollno = 102;
//         s2.section = "cse";
//         s2.marks = 90.6;

//         classroom s3 = new classroom();
//         s3.name = "sairam";
//         s3.rollno = 103;
//         s3.section = "cse";
//         s3.marks = 85.6;

//         classroom s4 = new classroom();
//         s4.name = "ravi";
//         s4.rollno = 104;
//         s4.section = "ece";
//         s4.marks = 88.7;

//         s1.show();
//         s2.show();
//         s3.show();
//         s4.show();
//     } 
// }






// //stringbuilder example code
// public class dcp6 
// {
//     public static void main(String[] args) 
//     {
//         StringBuilder  sb = new StringBuilder("karthik");

//         sb.append(" welcome");
//         System.out.println(sb);

//         sb.insert(0 ,"lets start ");
//         System.out.println(sb);
//     }    
// }







// //static method  example code 
// class classroom
// {
//     String name;
//     int rollno;
//     static String section;
//     double marks;

//     public void show()
//     {
//         System.out.println(name + ": " + rollno + ": " + section + ": " + marks);
//     }

//     public static void show1(classroom s)
//     {
//         System.out.println(s.name + ": " + s.rollno + ": " + s.section + ": " + s.marks);
//     }
// }
// public class dcp6 
// {
//     public static void main(String[] args) 
//     {
//         classroom s1 = new classroom();
//         s1.name = "karthik";
//         s1.rollno = 101;
//         s1.section = "cse";
//         s1.marks = 95.6;

//         classroom s2 = new classroom();
//         s2.name = "sai";
//         s2.rollno = 102;
//         s2.section = "cse";
//         s2.marks = 90.6;

//         classroom s3 = new classroom();
//         s3.name = "sairam";
//         s3.rollno = 103;
//         s3.section = "cse";
//         s3.marks = 85.6;

//         classroom s4 = new classroom();
//         s4.name = "ravi";
//         s4.rollno = 104;
//         s4.section = "ece";
//         s4.marks = 88.7;

//         classroom.section= "cse";

//         s1.show();
//         s2.show();
//         s3.show();
//         s4.show();

//         classroom.show1(s1);
//         classroom.show1(s2);
//     } 
// }






// //encapsulation , getters  and setters example code
// class human
// {
//     private int age;
//     private String name;
    
//     //setters and getters 
//     public int getage()
//     {
//         return age;
//     }
//     public void setage(int a)
//     {
//         age = a;
//     }
//     public String getname()
//     {
//         return name;
//     }
//     public void setname(String n)
//     {
//         name = n;
//     }
// }
    
// public class dcp6 
// {
//     public static void main(String[] args) 
//     {
//         human obj = new human();
//         obj.setage(21);
//         obj.setname("karthik");
        
//         System.out.println(obj.getage() + ":" + obj.getname());
//     } 
// }








//encapsulation , getters  and setters  with this keyword  example code
class human
{
    private int age;
    private String name;
    
    //getters and setters with this keyword
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class dcp6 
{
    public static void main(String[] args) 
    {
        human obj = new human();
        
        obj.setAge(10);
        obj.setName("sai");
        System.out.println(obj.getAge() + ":" + obj.getName());
    } 
}