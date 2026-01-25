package Array;

public class MinElement {
    public static void minElement(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min =arr[i];
            }
        }
        System.out.print("min value: "+min);
    }

    public static void main(String[] args) {
        int arr[]={12,45,67,23,89,34};
        minElement(arr);
    }
    
}
