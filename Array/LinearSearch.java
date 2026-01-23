package Array;
public class LinearSearch {
    public static int  Serach(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,9,10,11,12};
        int key=10;
        int index= Serach(arr, key);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is an index: "+ index);
        }
    }
}
