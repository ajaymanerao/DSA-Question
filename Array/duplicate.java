package Array;

import java.util.Arrays;

public class duplicate {
    public static void findDuplicate(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        findDuplicate(arr);
    }
    
}
