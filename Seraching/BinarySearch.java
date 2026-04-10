package Seraching;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int element){
    int low=0;
    int high=arr.length;

    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==element){
            return mid;
        }else if(arr[mid]< element){
            low=mid+1;
        }else if(arr[mid]> element){
            high =mid-1;
        }
        
    }
     return-1;
}
    public static void main(String[] args) {
        int arr[]={1,2,4,7,8,9,4,9};
        Arrays.sort(arr); 
        for(int i=0;i<arr.length;i++){
            System.out.println(i+" "+arr[i]);
        }
        System.out.println("-----------------------------------");
        int element =9;
       // binarySearch(arr, 9);
        int index= binarySearch(arr, element);
        System.out.println("Index : "+index+" "+"Element : "+element);
        
    }
    
}
