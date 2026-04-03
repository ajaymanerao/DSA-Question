package collection.ArrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<Integer>duplist=new ArrayList<>( Arrays.asList(1,2,3,4,5,61,2,3,7,8,9));
        ArrayList<Integer>uniqueList=new ArrayList<>(new LinkedHashSet(duplist));
        System.out.println(uniqueList);
    }
    
}
