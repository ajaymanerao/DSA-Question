package arraylist;

import java.util.ArrayList;

public class Remove {
    public static void removeElement(ArrayList<Integer>list){
        int position =2;
        if(position>=0 && position<list.size()){
            list.remove(position);
            System.out.println(list);
        }else{
            System.out.println("Invalid Position");
        }
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
    removeElement(list);
    }
    
}
