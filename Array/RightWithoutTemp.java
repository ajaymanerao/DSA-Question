package Array;

public class RightWithoutTemp {
    public static void rightShift(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i]+arr[n-1];
            arr[n-1]=arr[i]-arr[n-1];
            arr[i]=arr[i]-arr[n-1];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        rightShift(arr);
    }
    
}
