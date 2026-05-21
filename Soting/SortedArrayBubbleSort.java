package Soting;
import java.util.*;

public class SortedArrayBubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        boolean sorted;
        for(int i=0;i<n-1;i++){
            sorted= false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sorted=true;
                }
            }
            if(sorted==false){
            break;
        }
        }
         
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);

        System.out.println("Sorted Array");
        System.out.println("-------------------------------------");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}

