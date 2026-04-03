package collection.ArrayListPro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program10 {
    public static void main(String[] args) {
        Set<Integer>setA=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer>setB=new HashSet<>(Arrays.asList(1,2,3,6));
        Set<Integer>setC=new HashSet<>(Arrays.asList(1,3,4,5,6));

        Set<Integer> intersection=new HashSet<>(setA);
        intersection.retainAll(setB);
        intersection.retainAll(setC);
        System.out.println(intersection);

        
    }
    
}
