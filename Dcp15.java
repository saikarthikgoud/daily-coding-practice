// // // need  of stream api example code

// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

// public class Dcp15 
// {
//     public static void main(String[] args) 
//     {
//         List<Integer> nums = Arrays.asList(8,3,2,5,7,1,4,6);


//         ////regular method
//         // int sum = 0;
//         // for(int n : nums)
//         // {
//         //     if(n%2 ==0)
//         //     {n = n*2;
//         //     sum = sum + n;
//         //     }
//         // }
//         // System.out.println(sum);




//         ////using stream
//         // Stream<Integer> s1 = nums.stream();
//         // Stream<Integer> s2 = s1.filter(n -> n%2==0);
//         // Stream<Integer> s3 = s2.map(n -> n*2);
//         // int result = s3.reduce(0, (c,e) -> c+e);



//         ////using stream in simple 
//         // int result = nums.stream()
//         //                 .filter(n -> n %2 == 0)
//         //                 .map(n -> n * 2)
//         //                 .reduce(0, (c,e) -> c+e);
//         // System.out.println(result);



//         //using stream for sorting
//         Stream<Integer> sortedvalues= nums.stream()
//                         .filter(n -> n %2 == 0)
//                         .sorted();
                       
//         sortedvalues.forEach(n -> System.out.println(n));
//     }
// }











//parallel stream

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Dcp15 {

    public static void main(String[] args) {
        
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i = 1; i <=size;i++){
            nums.add(ran.nextInt(100));
        }

        
        long startseg = System.currentTimeMillis();
        int sum2 = nums.stream()
                        //.map(i -> i*2)
                        .map(i -> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {

                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endseg = System.currentTimeMillis();


        long startpara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                         //.map(i -> i*2)
                        .map(i -> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            return i*2;
                        })                        .mapToInt(i -> i)
                        .sum();
        long endpara = System.currentTimeMillis();

        System.out.println(sum2 + "  " + sum3);
        System.out.println(endseg- startseg);
        System.out.println(endpara-startpara);
    }
}