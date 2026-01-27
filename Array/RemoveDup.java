package Array;

import java.util.HashSet;

public class RemoveDup {
    public static void removeDup(int arr[]){
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            int first=arr[i];
            if(first!=arr[i+1]){
                 System.out.print(arr[i]+" ");
            }
            
            
        }
         System.out.print(arr[arr.length-1]+" ");

    }


    //------------------OR--------------

    public static void removeDuplicate(int arr[]){
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
          set.add(arr[i]);
        }

        System.out.print(set);
    }


    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5};
        removeDup(arr);
         removeDuplicate(arr);
    }
    
}
