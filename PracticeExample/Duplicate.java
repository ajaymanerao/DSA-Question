package PracticeExample;

import java.util.HashSet;
import java.util.Set;

import Array.duplicate;

public class Duplicate {
    public static void duplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    public static void removeduplicate(int arr[]){
     Set<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }

        for(int y:set){
            System.out.print(y+" ");
        }

        
    }


    public static void main(String[] args) {
        int arr[]={4,2,4,5,2,3,1};
        //duplicate(arr);
        removeduplicate(arr);

    }
    
}
