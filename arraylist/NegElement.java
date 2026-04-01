package arraylist;

import java.util.ArrayList;

public class NegElement {
     public static void findPosElement(ArrayList<Integer>list){
        System.out.print("Positive Number :");
        for(int i=0;i<list.size();i++){
            if(list.get(i)>0){
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println();

    }
    
       public static void findZeroElement(ArrayList<Integer>list){
        System.out.print("Positive Number :");
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println();

    }




    public static void findNegElement(ArrayList<Integer>list){
        System.out.print("Negative Number :");
        for(int i=0;i<list.size();i++){
            if(list.get(i)<0){
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println();

    }


    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(-20);
    list.add(-30);
    list.add(-40);
    list.add(50);
    list.add(-1);
    list.add(0);
    findPosElement(list);
    findNegElement(list);
    findZeroElement(list);
    }
    
}
