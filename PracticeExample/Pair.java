package PracticeExample;

public class Pair {
    public static void findPair(int arr[]){
        int target=20;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+", "+arr[j]+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,8,12,16};
        findPair(arr);
    }
    
}
