// //arraylist example code 

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;

// public class Dcp12 
// {
//  public static void main(String[] args) 
//  {
//     //Collection<Integer> nums = new ArrayList<Integer>();
//     List<Integer> nums = new ArrayList<Integer>();
//     nums.add(9);
//     nums.add(8);
//     nums.add(6);
//     nums.add(4);

//     // System.out.println(nums.indexOf(6));
//     // System.out.println(nums.get(3));

//     System.out.println(nums);
    
//     // for(int n : nums)
//     // {
//     //     System.out.println(n);
//     // }
    
//  }   
// }














// // set example code

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
// import java.util.Iterator;
// //import java.util.Collection;
// import java.util.List;
// import java.util.Set;
// import java.util.TreeSet;

// public class Dcp12 
// {
//  public static void main(String[] args) 
//  {
//     // Set<Integer> nums = new HashSet<Integer>();        
//     // Set<Integer> nums = new TreeSet<Integer>();              //to print a orded values
//     Collection<Integer> nums = new TreeSet<Integer>();

//     nums.add(92);
//     nums.add(86);
//     nums.add(68);
//     nums.add(42);

//     // for(int n : nums)
//     //     {
//     //         System.out.println(n);
//     //     }


//     Iterator<Integer> values = nums.iterator();

//     while (values.hasNext()) 
//     {
//         System.out.println(values.next());        
//     }
//  }   
// }











// //Map example code

// import java.util.HashMap;
// import java.util.Map;

// public class Dcp12 
// {
//     public static void main(String[] args) 
//     {
//         Map<String,Integer> students = new HashMap<>();

//         students.put("sai", 77);
//         students.put("sairam", 67);
//         students.put("ravi", 70);
//         students.put("maruthi", 74);
//         students.put("sai", 85);


//         //System.out.println(students);

//         System.out.println(students.keySet());

//         for(String key : students.keySet())
//         {
//             System.out.println(key + ":" + students.get(key));
//         }
//     }
// }








// //comparatoe vs comparable example code

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;


// class students
// {
//     int age;
//     String name;

    
//     public students(int age, String name) 
//     {
//         this.age = age;
//         this.name = name;
//     }


//     @Override
//     public String toString() 
//     {
//         return "students [age=" + age + ", name=" + name + "]";
//     }
   
// }

// public class Dcp12 
// {
//     public static void main(String[] args) 
//     {

//         // Comparator<students> com = new Comparator<students>() 
//         // {
//         //     public int compare(students i , students j)
//         //     {
//         //         if(i.age > j.age)
//         //             return 1;
//         //         else
//         //             return -1;
//         //     }
//         // };

//         Comparator<students> com = ( i ,  j) -> i.age > j.age?1:-1;

//         List<students> stud = new ArrayList<>();
//         stud.add(new students(21, "sai"));
//         stud.add(new students(22, "sai ram"));
//         stud.add(new students(23, "ravi"));
//         stud.add(new students(20, "jhon"));

//         Collections.sort(stud , com);
//         for(students s : stud)
//         {
//             System.out.println(s);
//         }
//     }
// }






// //example code with compring names

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;


// class students
// {
//     int age;
//     String name;

    
//     public students(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }


//     @Override
//     public String toString() {
//         return name + " ("+ age +")";
//     }

//     public static String addNumbering(int n, students student) {
//         return n + ". " + student.name + " (" + student.age + ")";
// }

// public class Dcp12 
// {
//     public static void main(String[] args) 
//     {
//         List<students> stud = new ArrayList<>();
//         stud.add(new students(21, "ajay"));
//         stud.add(new students(22, "sai ram"));
//         stud.add(new students(23, "charan"));
//         stud.add(new students(20, "jhon"));

//         // Comparator<students> com = new Comparator<students>() 
//         // {
//         //     public int compare(students s1, students s2) 
//         //     {
//         //         return s1.name.compareTo(s2.name); // Compare by name
//         //     }
//         // };


//         Comparator<students> com = ( s1,  s2) -> s1.name.compareTo(s2.name);                   //with lambda
  

//         Collections.sort(stud , com);
//         int count = 0;
//         for(students s : stud)
//         {
//             System.out.println(students.addNumbering(count++, s));
//         }

//     }
// }
// }










// // // for each method example code 


// import java.util.Arrays;
// import java.util.List;

// public class Dcp12 
// {
//     public static void main(String[] args) 
//     {
//         List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8);

//         nums.forEach(n->System.out.println(n));
//     }
// }




// // need  of stream api example code

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Dcp12 
{
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8);

        // int sum =0;
        // for(int n : nums)
        // {
        //     if(n%2==0)
        //     {
        //         n=n*2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);



        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);

        System.out.println(result);

        //s3.forEach(n -> System.out.println(n));
        

    }
}












