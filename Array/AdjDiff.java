package Array;

public class AdjDiff {
    public static void adjDiff(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            arr[i]=Math.abs(arr[i+1]-arr[i]);
            System.out.print(arr[i]+" ");
        }


    }

    public static void main(String[] args) {
        int arr[]={15,23,18,26,72,36};
        adjDiff(arr);
    }
    
}
