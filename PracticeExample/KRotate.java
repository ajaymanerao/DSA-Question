package PracticeExample;

public class KRotate {
    public static void krotate(int arr[], int target){
    int arr1[]=new int[arr.length];
    int j=0;
    for(int i=target;i<arr.length;i++){
        arr1[j]=arr[i];
        j++;
    }

    for(int k=0;k<target;k++){
        arr1[j]=arr[k];
        j++;
    }

    for(int x:arr1){
        System.out.print(x+" ");
    }

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        krotate(arr, 2);
    }
    
}
