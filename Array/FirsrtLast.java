package Array;

public class FirsrtLast {
    public static void firstLast(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
            int num2=arr[i];
            while(num>=10){
                num/=10;
                count++;

            }
            int power=(int)Math.pow(10, count);
            int rem=num2%power;
            arr[i]=rem*10+num;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={123,235,6754,64};
        firstLast(arr);
    }
    
}
