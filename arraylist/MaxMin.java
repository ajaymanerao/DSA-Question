package arraylist;

import java.util.*;
public class MaxMin {
    public static void findMax(ArrayList<Integer>list){
        int max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);

    }

    public static void findMin(ArrayList<Integer>list){
        int min=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println(min);

    }

    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    findMax(list);
    findMin(list);
    }
    
}
