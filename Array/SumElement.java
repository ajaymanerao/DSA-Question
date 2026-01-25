package Array;

public class SumElement {
    public static void sumElement(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }

        System.out.println("Sum of all digit: "+sum);
    }


    public static void main(String[] args) {
        int arr[]={5,8,12,6};
        sumElement(arr);
    }
    
}
