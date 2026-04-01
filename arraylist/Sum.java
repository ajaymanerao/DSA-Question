package arraylist;
import java.util.*;
public class Sum {
public static void sumOfElement(int arr[]){
    ArrayList<Integer>list=new ArrayList<>();
    for(int x: arr){
        list.add(x);
    }

    int sum=0;
    for(int y:list){
        sum+=y;
    }
    System.out.println(sum);

}


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        sumOfElement(arr);
        
    }
    
}