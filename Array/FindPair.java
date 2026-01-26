package Array;

public class FindPair {
    public static void findPair(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==key){
                    System.out.print("("+arr[i]+","+arr[j]+") ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,8,12,16};
        int key=20;
        findPair(arr, key);
    }
    
}
