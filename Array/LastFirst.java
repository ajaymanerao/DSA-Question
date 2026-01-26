package Array;

public class LastFirst {
    public static void lastFirst(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num =arr[i];
            int count=0;
            while(num>=10){
                count++;
                num /=10;
            }
            int pow=(int)Math.pow(10, count);
            int firstDigit=arr[i]/pow;
            int rem=arr[i]%pow;

            arr[i]=rem*10+firstDigit;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 

    public static void main(String[] args) {
        int arr[]={123, 235, 6754, 64};
        lastFirst(arr);
    }
    
}
