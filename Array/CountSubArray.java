package Array;
public class CountSubArray {
    public static void CountSub(int arr[]){
    int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    
                }
                 count++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total count "+count);
        
    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        CountSub(arr);
        
    }
    
}
