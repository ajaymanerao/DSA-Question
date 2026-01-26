package Array;

public class LastToFirst {
    public static void lastToFirst(int arr[]){
        int first=arr[arr.length-1];
         
        for(int i=arr.length-1;i>0;i--){
             arr[i]=arr[i-1];
        }
        arr[0]=first;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        lastToFirst(arr);
    }
    
}
