package FunctionalPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program8 {
    public static void main(String[] args) {
        List<String> friends=Arrays.asList("Resh","Ram","Nitin","Neha","Amit");
        List<String>result= new ArrayList<>();

        for(String name: friends){
            if(name.startsWith("N")){
                result.add(name);
            }
        }


        System.out.println(result);

        //predicate

        Predicate<String>checkWithN= s -> s.startsWith("N");

        friends.stream()
                .filter(checkWithN)
                .forEach(System.out::println);

        long countWithN=friends.stream().filter(name -> name.startsWith("R")).count();
        System.out.println(countWithN);


        Predicate<String>checkWithR= s -> s.startsWith("Re");

        friends.stream()
                .filter(checkWithR)
                .forEach(System.out::println);

        long countWithR=friends.stream().filter(name -> name.startsWith("Re")).count();
        System.out.println(countWithR);


        Predicate<String>checkWithA= s -> s.startsWith("A");

        friends.stream()
                .filter(checkWithA)
                .forEach(System.out::println);

        long countWithA=friends.stream().filter(name -> name.startsWith("A")).count();
        System.out.println(countWithA);
    
    
    
    }
    
}
