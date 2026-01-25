package Array;

public class AvgOddEven {
    public static void avgOddEven(int arr[]){
        int sumEven=0, count1=0;
        int sumOdd=0, count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){ count1++; sumEven +=arr[i];}
            else{
            sumOdd+=arr[i]; count2++;}
        }
        
        int n=arr.length;
        System.out.println("Avg of Even Number: "+sumEven/count1);
        System.out.println("Avg of Odd Number: "+sumOdd/count2);

    }

    public static void main(String[] args) {
        int arr[]={5,10,15,20,25};
        avgOddEven(arr);
        
    }
    
}
