package Array;

public class Kadense {
    public static void Kadanse(int arr[]){
        int MaxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum +=arr[i];
            if(currentSum< 0){
                currentSum=0;
            }
        
            MaxSum=Math.max(currentSum, MaxSum);
        }
        System.out.println(MaxSum);
    }


    public static void main(String[] args) {
        int arr[]={1,-2,3,4,5,6};
        Kadanse(arr);

    }
    
}
