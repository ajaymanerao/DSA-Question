package PracticeExample;

public class LargestNumber {
    public static void largestNumber(int arr[]){
        int max=arr[0];
        int secmax=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                secmax=max;
                max=arr[i];
                
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }


    public static void main(String[] args) {
        int arr[]={4,2,5,8,9,6};
        largestNumber(arr);
        
    }
    
}
