package Array;

public class FindTripleSum {
    public static void findTripleSum(int arr[],int key){
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==key){
                    System.out.print("("+arr[i]+","+arr[j]+","+arr[k]+") ");
                }
            }
          }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,9,12,15};
        int key =30;
        findTripleSum(arr, key);
    }
    
}
