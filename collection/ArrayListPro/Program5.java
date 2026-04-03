package collection.ArrayListPro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(11,2,3,4,5,6,7,8,9));
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,8,9));
        list1.retainAll(list2);
        System.out.println(list1);

    }
    
}
