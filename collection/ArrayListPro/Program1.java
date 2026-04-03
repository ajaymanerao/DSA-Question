package collection.ArrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Program1 {
    public static void alphabetically(ArrayList<String>name){
        Collections.sort(name);
        System.out.println(name);

    }

    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>(Arrays.asList("Ajay", "Anerao","Madhavrao","Benal"));
        alphabetically(name);
        
    }
    
}
