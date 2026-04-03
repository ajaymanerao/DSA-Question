package collection.ArrayListPro;

import java.util.Arrays;
import java.util.LinkedList;

public class Program11 {
    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList<>(Arrays.asList(1,2,3));
        LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(1,2,3));
        System.out.println(list1.equals(list2));

    }
}
