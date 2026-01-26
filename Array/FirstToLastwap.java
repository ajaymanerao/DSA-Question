package Array;

public class FirstToLastwap {
    public static void FirstToLastwap(int arr[]){
        int first=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=first;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        FirstToLastwap(arr);
        
    }
    
}
