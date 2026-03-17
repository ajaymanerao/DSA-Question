package Array;

public class ZeroLast {
    public static void ZeroLast(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }

         while(j<arr.length){
            arr[j]=0;
            j++;
         }


        for(int x: arr){
            System.out.print(x+" ");
        }




    }



    public static void main(String[] args) {
        int arr[]={1,2,0,4,0,5,0,8,0,9,0,7,3,0};
        ZeroLast(arr);

    }
    
}
