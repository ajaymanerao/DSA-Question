package PracticeExample;

public class FirtstoLastThird {
    public static void withoutThirdVariable(int arr[]){
        //  for(int i=0;i<arr.length-1;i++){
        //     arr[i]=arr[i]+arr[i+1];
        //     arr[i+1]=arr[i]-arr[i+1];
        //     arr[i]=arr[i]-arr[i+1];
        //  }
        //  for(int x:arr){
        //     System.out.print(x+" ");
        //  }
        //  System.out.println();

         for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i]+arr[i-1];
            arr[i-1]=arr[i]-arr[i-1];
            arr[i]=arr[i]-arr[i-1];
         }
         for(int y:arr){
            System.out.print(y+" ");
         }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        withoutThirdVariable(arr);
    }
    
}
