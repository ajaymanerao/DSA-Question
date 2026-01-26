package Array;

public class ReverseEach {
    public static void reverseEach(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int rev=0;
            while(num!=0){
                int d=num%10;
                rev=rev*10+d;
                num /=10;
            }

            arr[i]=rev;
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        int[] var1 = new int[]{123, 235, 6754, 64};
        reverseEach(var1);
    }
    
}
