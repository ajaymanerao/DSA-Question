package Array;

public class SumSub {
    public static void sumSub(int arr[],int target){
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
    }



    public static void main(String[] args) {
        int arr[]={1,2,7,11,15,8};
        int target=9;
        sumSub(arr,target);
    }
    
}
