package Array;

public class ReplaceAvg {
    public static void replaceAvg(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int sum=0;
            int count=0;
            while(num!=0){
                int d=num%10;
                sum+=d;
                num/=10;
                count++;
            }

            int avg=sum/count;
            arr[i]=avg;
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        int arr[]={123,235,6754,64};
        replaceAvg(arr);
    }
    
}
