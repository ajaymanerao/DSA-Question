package Array;

public class FirstDigit {
    public static void firstDigit(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            while(num>10){
                int d=num%10;
                num /=10;
            }
            arr[i]=num;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={123,235,6754,64,2367};
        firstDigit(arr);
        
    }
    
}
