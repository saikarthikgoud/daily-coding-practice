// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Optional;
// import java.util.stream.Stream;

// public class Dcp16 {
//  public static void main(String[] args) {
//     List<String> names = Arrays.asList("sai","karthik","jhon","josh");

//     // Optional<String> name = names.stream()
//     //                             .filter(str -> str.contains("s"))
//     //                             .findFirst();
    
//     // System.out.println(name.orElse("not found"));

//     String name = names.stream()
//                                 .filter(str -> str.contains("j"))
//                                 .findFirst()
//                                 .orElse("not found");
    
//     System.out.println(name);

//  }   
// }



// //method reference

// import java.util.Arrays;
// import java.util.List;

// public class Dcp16 {
//  public static void main(String[] args) {
//     List<String> names = Arrays.asList("sai","karthik","jhon","josh","ravi");
 
//     // List<String> uNames = names.stream()
//     //                             .map(name -> name.toUpperCase())
//     //                             .toList();

//     // System.out.println(uNames);

//     List<String> uNames = names.stream()
//                                 .map(String::toUpperCase)
//                                 .toList();

//     // uNames.forEach(i -> System.out.println(i));
//     uNames.forEach(System.out::println);

// }
// }










//constructor reference

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
    private String name;
    private int age;
    public Student(int age) {
        this.age = age;
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString()
    {
        return "student[name= " + name + ",age ="+ name +" ]";
    }
}



public class Dcp16 {

    public static void main(String[] args) {
    List<String> names = Arrays.asList("sai","karthik","jhon","josh","ravi");

    List<Student> students = new ArrayList<>();

    // for(String name : names){
    // students.add(new Student(name));  
    // }


    // students = names.stream()
    //                 .map(name -> new Student(name))
    //                 .toList();

students = names.stream()
                    .map(Student::new)
                    .toList();

    System.out.println(students);
    }   
}
