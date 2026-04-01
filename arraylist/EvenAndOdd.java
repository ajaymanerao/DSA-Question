package arraylist;

import java.util.ArrayList;

public class EvenAndOdd {
    public static void findEven(ArrayList<Integer>list){
        System.out.print("Even Element :");
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println();
    }


     public static void findOdd(ArrayList<Integer>list){
        System.out.println("---------------------------------");
        System.out.print("Odd Element :");
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2!=0){
                System.out.print(list.get(i)+", ");
            }
        }
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

    findEven(list);
    findOdd(list);
    }
    
}
