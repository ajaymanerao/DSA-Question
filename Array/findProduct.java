package Array;

public class findProduct {
    public static void product(int arr[]){
        int n=arr.length;
        int result[]=new int [n];
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
            if(i!=j){
                product *=arr[j];
            }
        }
        result[i]=product;
        }
        for(int x :result){
            System.out.print(x+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        product(arr);
    }
    
}
