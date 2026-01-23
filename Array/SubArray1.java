package Array;
public class SubArray1 {
    public static void SubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    
                    
                }
                 System.out.print(")");
                System.out.println();
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        SubArray(arr);
    }
    
}
