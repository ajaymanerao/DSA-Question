package IProgrammer;

public class IsSorted {
    public static void isSorted(int arr[]){
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }

        System.out.println(isSorted);
    
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        isSorted(arr);
    }
}
