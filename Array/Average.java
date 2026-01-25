package Array;

public class Average {
    public static void averageDigit(int arr[]){
        int sum=0;
        double avg=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }

        avg=sum/n;
        System.out.println("sum :"+sum);
        System.out.println("Average :"+avg);
    }


    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        averageDigit(arr);
    }
    
}
