package Array;

import java.util.Arrays;

public class DuplicateRemove {
    public static void duplicateRemove(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
          int first =arr[i];
          while(i<arr.length-1 && arr[i]==arr[i+1]){
            i++;
          }
          System.out.println(first);

        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,2,1,4,5,5,4,2,3,3,3};
        duplicateRemove(arr);
    }
    
}
