package FunctionalPro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class Program9 {

    public static Predicate<String> checkIfStartWith(final String letter){
        return name -> name.startsWith(letter);

    }


    public static void main(String[] args) {
        List<String> friends=Arrays.asList("Ram", "Nitin", "Neha", "Amit");
        List<String> childhoodFriends=Arrays.asList("Ravi", "Suresh", "Meena", "Kiran");
        List<String> collegeFriends=Arrays.asList("Arjun", "Priya", "Kunal", "Sneha");

          long countWithN=friends.stream().filter(checkIfStartWith("N")).count();

          System.out.println(countWithN);

    }
    
}
