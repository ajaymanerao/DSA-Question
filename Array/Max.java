package Array;

public class Max {
    public static void MaxNum(int arr[]){
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(maxnum<arr[i]){
                maxnum=arr[i];
            }
        }
        System.out.println("Maximum Number is: "+maxnum);



        int minnum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(minnum>arr[i]){
                minnum=arr[i];
            }
        }
        System.out.println("Minimum number is: " +minnum);

    }


    public static void main(String[] args) {
        int arr[]={7,8,9,4,5,6,1,2,3};
        MaxNum(arr);
        
    }
    
}
