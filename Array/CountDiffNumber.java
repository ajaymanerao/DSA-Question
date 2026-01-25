package Array;

public class CountDiffNumber {
    public static void countDiffNumber(int arr[]){
        int zero=0;
        int negative=0;
        int positive=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if (arr[i]>0) {
                positive++;
                
            }else{
                negative++;
            }
        }
        System.out.println("Total Zero Number: "+zero);
        System.out.println("Total Positive Number: "+positive);
        System.out.println("Total Negative Number: "+negative);
    }

    public static void main(String[] args) {
        int arr[]={0,-5,12,-3,8,0};
        countDiffNumber(arr);

    }
    
}
