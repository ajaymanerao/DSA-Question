package collection.ArrayListPro;

import java.util.ArrayList;
import java.util.Arrays;

public class Program9 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(6,7,8,9,0));
        list1.addAll(list2);
        System.out.println(list1);
    }
    
}
