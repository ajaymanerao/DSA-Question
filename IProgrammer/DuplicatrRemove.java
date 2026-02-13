package IProgrammer;

import java.util.HashSet;

public class DuplicatrRemove {
    public static void removeDuplicate(int arr[]){
    HashSet<Integer>set=new HashSet<>();
    // for(int x :arr){
    //     set.add(x);
    // }

    // System.out.println("Remove Duplicate : "+set);
    System.out.println();
   for(int y :arr){
    if(!set.add(y)){
         System.out.print(y+" ");
    }

   }
 
}

    public static void main(String[] args) {
        int arr[]={1,1,2,3,6,2,5};
        removeDuplicate(arr);
    }
    
}
