package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate {public static void main(String[] args) {
    int arr[]={10,2,1,1,2,3,4,5,6,3};
     Set<Integer> num=new HashSet<>();
     for(int n:arr){
        num.add(n);
     }

     System.out.println(num);


     HashSet<Integer> set=new HashSet<>();
     set.add(10);
     set.add(48);
     set.add(30);
     set.add(33);
     System.out.println(set);
}
    
}
