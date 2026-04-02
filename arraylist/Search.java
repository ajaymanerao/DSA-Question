package arraylist;

import java.util.ArrayList;

public class Search {
    public static void SearchElement(ArrayList<Integer> list){

        int target=30;
        
        
        boolean found=false;
        for(int i=0;i<list.size();i++){
            int value=list.get(i);
            if(target==value){
                System.out.println("Element are Found in index : "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element are not Found");
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
    list.add(0);
    SearchElement(list);
    }
}
