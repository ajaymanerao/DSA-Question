package PracticeExample;

public class Swap {
    public static void swapNumber(int arr[]){
    int i=0;
    int j=arr.length-1;
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;  
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");

    }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        swapNumber(arr);


    }
    
}
