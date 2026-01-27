package Array;

public class SumTwoPointer {
    public static void sumTwoPointer(int arr[], int target){
            int start=0;
            int end =arr.length-1;
            while (start<end) {
                int sum=arr[start] + arr[end];
             if(sum==target){
                System.out.println("("+arr[start]+","+arr[end]+") ");
                 start++;
                 end--;
            }  
            else if(sum<target) {
                start++;
            }else{
                end--;
            }
            }
             
             
        
    }


    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,8,9};
        int target=10;
        sumTwoPointer(arr, target);
    }
    
}
