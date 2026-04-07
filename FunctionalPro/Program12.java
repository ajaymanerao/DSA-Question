package FunctionalPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program12 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        List<Integer> squares = list.stream()
                                    .map(n -> n * n)
                                    .collect(Collectors.toList());

        System.out.println(squares);


        List<String>str=Arrays.asList("Ram","Shyam");
                              str.stream()
                              .map(n -> "Mr. "+n).forEach(System.out::println);


         List<Integer> list1=Arrays.asList(1,2,3);
                                list1.stream()
                                .map(s -> list1.toString())
                                .forEach(System.out::println);


    }
    
}
