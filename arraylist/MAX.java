package arraylist;

import java.util.ArrayList;

public class MAX {
public static void findMax(){
    ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);


    int max=list.get(0);
    for(int i=1;i<list.size();i++){
        if(list.get(i)>max){
            max=list.get(i);
        }
    }
    System.out.println("Maximum Number Is :"+max);
}

public static void findMin(){
     ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    
    int min=list.get(0);
    for(int i=1;i<list.size();i++){
        if(list.get(1)>min){
            min=list.get(i);
        }
    }

    System.out.println("Minimum Number Is :"+min);

}

    public static void main(String[] args) {
        findMax();
        findMin();
    }
    
}
