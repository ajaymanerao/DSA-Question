package PracticeExample;

public class GreaterAVG {
    public static void greaterAvg(int arr[]){
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int average=sum/arr.length;

        for(int j=0;j<arr.length;j++){
            if(average<arr[j]){
                System.out.println(arr[j]);
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={3,7,9,2,6};
        greaterAvg(arr);
        
    }
    
}
