package Array;

public class MaxAdjDiff {
    public static void maxAdjDiff(int arr[]){
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            int num=Math.abs(arr[i+1]-arr[i]);
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum adjacent difference: "+max);
    }

    public static void main(String[] args) {
        int arr[]={15,23,18,26,72,36};
        maxAdjDiff(arr);
    }
    
}
