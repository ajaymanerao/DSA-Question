package Array;
public class MAxSumArray1 {

    public static void MaxSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum +=arr[k];

                }
                if(maxSum<currSum){
                    maxSum= currSum;
                }
            }
        }
        System.out.println("Max Sum "+maxSum);

    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        MaxSum(arr);
        
    }
    
}
