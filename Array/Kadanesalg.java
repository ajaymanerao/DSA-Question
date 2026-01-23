package Array;
public class Kadanesalg {
    public static void Kadanes(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum, maxSum);

        }
        System.out.println("Our max sum is "+maxSum);

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Kadanes(arr);
    }
    
}
