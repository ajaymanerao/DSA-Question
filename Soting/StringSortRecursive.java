package Soting;

public class StringSortRecursive {
    public static void stringbubbleSort(String arr[], int n){
        if(n==1) return;
        for(int i=0;i<n-1;i++){
          if(arr[i].compareTo(arr[i+1])>0){
            String temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
          }
    }
    stringbubbleSort(arr,n-1);
    }


    public static void main(String[] args) {
     String arr[] = {"Java", "C", "Python", "Android"};
     int n=arr.length;

        stringbubbleSort(arr,n);

        for(String s : arr) {
            System.out.print(s + " ");
        }
    }
    
}
