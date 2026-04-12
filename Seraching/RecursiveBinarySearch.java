package Seraching;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static int binarySearch(int arr[],int low, int high,int element){
    int mid=(low+high)/2;
    if(low>high)
        return -1;

    if(arr[mid]==element){
        return mid;
    }else if(arr[mid]<element){
        low =mid+1;
        return binarySearch(arr,low, high, element);

    }else if(arr[mid]>element){
        high=mid-1;
        return binarySearch(arr,low, high, element);
    }
    return -1;

}
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9,3};
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int element=9;
        int index= binarySearch(arr, low, high, element);
        System.out.println("Index : "+index+"  Element : "+element);
    }
    
}
