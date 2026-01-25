package Array;

public class CountEvenOdd {
    public static void countEvenOdd(int arr[]){
        int countEven=0, countodd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countEven++;
            }else{
                countodd++;
            }
        }
        System.out.println("Total Number of Even Number: "+countEven);
        System.out.println("Total Number of Odd: "+countodd);

    }

    public static void main(String[] args) {
        int arr[]={5,10,15,20,25};
        countEvenOdd(arr);
    }
    
}
