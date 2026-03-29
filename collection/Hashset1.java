package collection;

import java.util.*;

public class Hashset1 {
    public static void main(String[] args) {
        
        // HashSet<Integer>box=new HashSet<Integer>();
        // box.add(11);
        // box.add(111);
        // box.add(12);
		// box.add(21);
		// box.add(342);
		// box.add(12);
		// box.add(111);
		// box.add(11);
		// box.add(null);

        // System.out.println(box);
        // System.out.println(box.contains(11));
        int arr[]={1,1,2,2,3,4,5,6,7};
        Set<Integer>set=new LinkedHashSet<>();
        for(int x:arr){
            set.add(x);
        }
        System.out.println(set);
    }
    
}
