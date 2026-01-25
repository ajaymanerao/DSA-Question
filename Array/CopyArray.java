package Array;

public class CopyArray {
    public static void copyArray(int  arr[]){
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }

        System.out.print("CopyArray : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        copyArray(arr);

    }
    
}
