package collection;
import java.util.LinkedHashSet;

public class LinkedHashset1 {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer>box=new LinkedHashSet<Integer>();
        box.add(11);
        box.add(111);
        box.add(12);
		box.add(21);
		box.add(342);
		box.add(12);
		box.add(111);
		box.add(11);
		box.add(null);

        System.out.println(box);
        System.out.println(box.contains(11));
    }
    }
