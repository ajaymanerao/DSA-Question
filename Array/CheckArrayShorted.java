package Array;

public class CheckArrayShorted {
    public static boolean  checkArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

        

    }


    public static void main(String[] args) {
        int arr[]={5,10,15,20,25};
        System.out.println(checkArray(arr)); 

    }
    
}
