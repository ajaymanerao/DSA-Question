package Array;

public class FirstToLastSwapTemp {
    public static void firstToLastSwap(int arr[]){
        int n=arr.length;
        arr[0]=arr[0]+arr[n-1];
        arr[n-1]=arr[0]-arr[n-1];
        arr[0]=arr[0]-arr[n-1];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    

    }
    

    public static void main(String[] args) {
        int arr[]={7,14,21,28,35};
        firstToLastSwap(arr);
        
    }
}
