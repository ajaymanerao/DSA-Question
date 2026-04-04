package FunctionalPro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Program2 {
    public static void main(String[] args) {
        List<String> cricketer=Arrays.asList("Rohit", "Virat","Rahul","Shreyas","QDK","SKY");
        //traditional way
        for(int i=0;i<cricketer.size();i++){
            System.out.print(cricketer.get(i)+" ");
        }

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
