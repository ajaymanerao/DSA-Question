package collection.ArrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("apple","apple","bananan","cat","dog"));
        Map<String, Integer> freq=new HashMap<>();
        for(String s:list){
            freq.put(s, freq.getOrDefault(s, 0)+1);

        }
        System.out.println(freq);




        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,2,1,3,4,5,6,4,6,7));
        Map<Integer, Integer> freq1=new HashMap<>();
        for(int a:list2){
            freq1.put(a, freq1.getOrDefault(a, 0)+1);

        }
        System.out.println(freq1);

    }
    
}
