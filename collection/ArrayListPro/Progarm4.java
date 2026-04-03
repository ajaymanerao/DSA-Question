package collection.ArrayListPro;

import java.util.Iterator;
import java.util.LinkedList;

public class Progarm4 {
    public static void main(String[] args) {
     LinkedList<Integer> list =new LinkedList<>();
     list.add(11);
     list.add(22);
     list.add(33);
     list.add(44);
     list.add(55);
     

     list.remove(Integer.valueOf(44));

     Iterator<Integer>itr=list.iterator();
     while (itr.hasNext()) {
        int a=itr.next();
        System.out.println(a);
        
     }

    }
    
}
