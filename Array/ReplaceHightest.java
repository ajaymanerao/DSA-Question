package Array;

public class ReplaceHightest {
    public static void replaceHightest(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int digit=Integer.MIN_VALUE;
            while(num!=0){
                int d=num%10;
                if(digit<d){
                    digit=d;
                }
                num/=10;
            }

            arr[i]=digit;
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
         int[] var1 = new int[]{123, 235, 6754, 64};
         replaceHightest(var1);
    }
    
}
