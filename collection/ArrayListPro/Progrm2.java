package collection.ArrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Progrm2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(11,22,33,66,88,44,99,66));
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
       int max=Collections.max(list);
       System.out.println(max);
    
}
}