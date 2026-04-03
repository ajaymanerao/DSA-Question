package collection.ArrayListPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Program6 {
    public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
      Collections.sort(list);
      System.out.println(list.get(list.size()-2));  
    }
    
}
