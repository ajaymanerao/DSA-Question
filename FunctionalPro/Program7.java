package FunctionalPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program7 {
    public static void main(String[] args) {
        List<String> friends =Arrays.asList("ram","shyam","rav");
        List<String> result =new ArrayList<String>();
        for(String name :friends){
            result.add(name.toUpperCase());
        }

        System.out.println(friends);
        System.out.println(result);

        Stream<String> stream=friends.stream();

        Function<String, String> transform=s -> s.toUpperCase();

        Stream<String> str1=stream.map(String::toUpperCase);

        str1.forEach(System.out::println);

        System.out.println("----------------");

        friends.stream()
               .map((name) -> name.toUpperCase())
               .forEach(n1 -> System.out.println(n1));
        System.out.println("----------------");
        
        friends.stream()
			   .map((name) -> name.length())
			   .forEach(System.out::println);

        System.out.println("----------------");

        System.out.println("-----------------");

        friends.stream()
               .map(String::length)
               .forEach(System.out::println);


        System.out.println("Collection result");

        List<String>finalResult=friends.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());


       System.out.println(finalResult);




    }
    
}
