package IProgrammer;
import java.util.*;
public class Duplicate {
public static void dupliacte(int arr[]){
    for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;   
                }
            }
        }
     
     
 //-----------------HashMethod---------------------

        HashSet<Integer>set=new HashSet<>();
        System.out.println("Duplicate element is ");
        for(int num :arr){
            if(!set.add(num)){
                System.out.print(num+" ");
            }
        }
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,5,3};
        dupliacte(arr);
    }
    
}
