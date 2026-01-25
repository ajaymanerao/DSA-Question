package Array;

import java.util.Arrays;

public class FreaquencyElement {
  
    public static void frequencyElement(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=1;
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+" "+count+" times");

        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,4,2};
        frequencyElement(arr);
    }
    
}
