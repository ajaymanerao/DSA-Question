package Array;

public class Reversearray {
    public static void reverseArray(int arr[]){
        
         for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
                
         }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        reverseArray(arr);
    }
    
}
