package Array;
public class MaxSumSubArray {
    public static void MAxSum(int A[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum +=A[k];

                }
                System.out.print(currSum+", ");
                if(maxSum<currSum){
                    maxSum=currSum;
                }


            }
        }
        System.out.println();
        System.out.println("Max Sum "+maxSum);
    }




    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        MAxSum(arr);
        
    }
    
}
