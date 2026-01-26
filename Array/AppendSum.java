package Array;

public class AppendSum {
    public static void appendSum(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int temp=arr[i];
            int sum=0;
            while (num!=0) {
                int d=num%10;
                sum +=d;
                num/=10;
            }
            int sumDigits = 0;
            int t = sum;
            while (t != 0) {
                sumDigits++;
                t /= 10;
            }
            int power=(int)Math.pow(10, sumDigits);
            arr[i]=temp*power+sum;
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
         int[] var1 = new int[]{123, 235, 6754, 64};
         appendSum(var1);
    }
    
}
