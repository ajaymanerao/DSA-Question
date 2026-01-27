package Array;

public class ReverseArrayTwoPointer {
    public static void ReverseArrayTwoPointer(int arr[]){
            int start=0;
            int end=arr.length-1;

            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
     

    public static void main(String[] args) {
     int arr[]={10,20,30,40,50};
     ReverseArrayTwoPointer(arr);
    }
    
}