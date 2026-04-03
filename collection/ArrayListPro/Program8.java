package collection.ArrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program8 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,4,5,6,8,9));
        Collections.sort(list);
        int k=3;
        System.out.println(list.get(k-1));
    }
}
