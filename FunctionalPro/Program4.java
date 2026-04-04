package FunctionalPro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Program4 {
    public static void main(String[] args) {
        Map<Integer,String> cricketer=new HashMap<>();
        cricketer.put(1, "Rohit");
        cricketer.put(2, "Virat");
        cricketer.put(3, "Rahul");
        cricketer.put(4, "Shreyas");
        cricketer.put(5, "QDK");
        cricketer.put(6, "SKY");
       
        

        //forEach
        for(Map.Entry<Integer, String> entry : cricketer.entrySet()){
            System.out.println(cricketer);
        }

        //Iterator
        Iterator<Map.Entry<Integer, String>> itr = cricketer.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("----------");

        //Using Consumer
        cricketer.forEach(new java.util.function.BiConsumer<Integer, String>() {
            public void accept(Integer key, String value) {
                System.out.println(key + " -> " + value);
            }
        });

        System.out.println("----------");

        //Using Lambda
        cricketer.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println("----------");

        //values
        cricketer.values().forEach(System.out::println);

        System.out.println("----------");

        //keys
        cricketer.keySet().forEach(System.out::println);
    }
    
}
