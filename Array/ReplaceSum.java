package Array;

public class ReplaceSum {
    public static void replaceSum(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int sum=0;
            while(num!=0){
                int d=num%10;
                sum+=d;
                num /=10;
            }

            arr[i]=sum;
            System.out.print(arr[i]+" ");

        }
        
    }

    public static void main(String[] args) {
        int arr[]={123,235,6754,64};
        replaceSum(arr);
    }
    
}
