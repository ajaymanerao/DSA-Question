package FunctionalPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program10 {
    public static void main(String[] args) {
        
        List<String> names=Arrays.asList("Amit", "Neha", "Raj", "Amit","John", "Sam");

       names.stream()
            .filter((name) -> name.startsWith("A"))
            .forEach(System.out::println);

            System.out.println("-------------------");

       names.stream()
             .map(name -> name.toUpperCase())
             .forEach(System.out::println);

        System.out.println("-----------------------");     


        List<List<String>>list=Arrays.asList(
            Arrays.asList("A","B"),
            Arrays.asList("C","D")

        );

        List<String>result=list.stream()
                            .flatMap(innerList -> innerList.stream())
                            .collect(Collectors.toList());

       System.out.println(result);
       System.out.println("--------------------------");

       names.stream()
       .distinct()
       .forEach(System.out::println);

       System.out.println("----------------------------");


       names.stream()
            .limit(3)
            .forEach(System.out::println);

        System.out.println("-----------------------------");


        names.stream()
            .skip(2)
            .forEach(System.out::println);

        System.out.println("-----------------------------");


        names.stream()
             .distinct()
             .forEach(System.out::println);

        System.out.println("-----------------------------");


        names.stream()
             .sorted()
             .forEach(System.out::println);

        System.out.println("-----------------------------");


        names.stream()
            .toList()
            .forEach(System.out::println);

        System.out.println("-----------------------------");

    long c=names.stream()
         .count();
         System.out.println(c);
         

        System.out.println("-----------------------------");


    }
    
}
