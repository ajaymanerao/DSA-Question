package collection.ArrayListPro;

import java.util.LinkedList;

public class Program14 {
    public static LinkedList<Integer> mearge (LinkedList<Integer> list1,LinkedList<Integer> list2){

     LinkedList<Integer>result=new LinkedList<>();
     while (!list1.isEmpty() && !list2.isEmpty()) {
        if(list1.peek()<= list2.peek()){
            result.add(list1.poll());
        }else{
            result.add(list2.poll());
        }
        
     }

     return result;



    }


    public static void main(String[] args) {
         LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(5);
        list1.add(10);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(3);
        list2.add(11);

        LinkedList<Integer>list=mearge(list1, list2);
        System.out.println(list);
    }
    
}
