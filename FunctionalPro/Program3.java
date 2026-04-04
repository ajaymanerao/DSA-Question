package FunctionalPro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Program3 {
    public static void main(String[] args) {
        Set<String> cricketer=new HashSet<>(Arrays.asList("Rohit", "Virat","Rahul","Shreyas","QDK","SKY"));
        //traditional way
        

        //forEach
        for(String str: cricketer){
            System.out.println(cricketer);
        }

        //Iterator
        Iterator<String> itr=cricketer.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }

        //Using Consumer
        cricketer.forEach(new Consumer<String>() {
            public void accept(String s){
                System.out.print(s+" ");
            }
            
        });


        //Using lambda
        Consumer<String> consumer=(name) -> System.out.print(name+" ");
        cricketer.forEach(consumer);

        //
        cricketer.forEach((String name) -> System.out.print(name+" "));
        cricketer.forEach(name -> System.out.print(name+" "));
		
		cricketer.forEach(System.out::print);

    }
    
}
