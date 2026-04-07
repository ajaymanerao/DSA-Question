package FunctionalPro;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program11 {
    public static void main(String[] args) {
        
        List<String> names=Arrays.asList("Amit", "Neha", "Raj", "Amit","John", "Sam");
        names.forEach(System.out::print);
        System.out.println();
        names.stream().forEach(System.out::println);

        Set<String> set=names.stream()
                             .collect(Collectors.toSet());
                             System.out.println(set);


        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //IMP
        int sum =numbers.stream()
                        .reduce(0, (a,b) -> a+b);
                        System.out.println(sum);

       long size=names.stream()
                      .count();
                      System.out.println(size);

        //optional
        Optional<String> op=names.stream()
                                .findFirst();
                                System.out.println(op);
                                System.out.println(op.get());
                            if(op.isPresent()){
                                System.out.println(op.get());
                            }else{
                                System.out.println("Noy Found");
                            } 

        Object arr[]=names.stream()
                          .toArray();
                          System.out.println(arr);

        names.stream()
             .max(null);
    }
    
}
