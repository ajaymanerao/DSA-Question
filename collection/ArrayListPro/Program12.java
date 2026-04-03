package collection.ArrayListPro;

import java.util.Arrays;
import java.util.LinkedList;

public class Program12 {
    public static void reverseLL(LinkedList<Integer>list){
        int start=0;
        int end=list.size()-1;
        while(start<end){
            int temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList(Arrays.asList(10,20,30));
        reverseLL(list);
    }
    
}
