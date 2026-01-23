package Array;

public class MaxProfit {
    public static int profit(int arr[]){
        int buyprice =arr[0];
        int maxProfit=0;
         
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buyprice){
                buyprice=arr[i];
                
            }else{
                maxProfit = Math.max(maxProfit, arr[i] - buyprice);
            }

        }
        return maxProfit;
         
    }


    public static void main(String[] args) {
        int arr[]= {3, 2, 6, 1, 4};
       System.out.println(profit(arr));  

    }
    
}
