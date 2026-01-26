package Array;

public class FirstToLastTemp {
    public static void firsTolasttemp(int arr[]){  
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i]+arr[i+1];
            arr[i+1]=arr[i]-arr[i+1];
            arr[i]=arr[i]-arr[i+1];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        firsTolasttemp(arr);
    }
    
}
