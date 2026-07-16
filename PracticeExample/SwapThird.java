package PracticeExample;

public class SwapThird {
    public static void swapThirdVariable(int arr[]){
        int i=0;
        int j=arr.length-1;
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={7,14,21,28,35};
        swapThirdVariable(arr);
    }
    
}
