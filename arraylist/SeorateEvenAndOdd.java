package arraylist;

import java.util.ArrayList;

public class SeorateEvenAndOdd {
    public static void SeprateEAndO(ArrayList<Integer>list){
    ArrayList<Integer> even=new ArrayList<>();
    ArrayList<Integer> odd=new ArrayList<>();

    for(int i=0;i<list.size();i++){
        int value = list.get(i);
        if(value%2==0){
            even.add(value);

        }else{
            odd.add(value);
        }
    }
    System.out.println(even);
    System.out.println(odd);
    }
    


    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(9);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(11);
    list.add(27);
    list.add(19);
    list.add(15);
    list.add(0);
    SeprateEAndO(list);
    }
}
