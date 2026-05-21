package Soting;

public class StringSort {
    public static void stringbubbleSort(String arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }


       public static void main(String[] args) {
        String arr[] = {"Java", "C", "Python", "Android"};

        stringbubbleSort(arr);

        for(String s : arr) {
            System.out.print(s + " ");
        }
    }
    
}
