package PracticeExample;

public class FirsttoLast {
    public static void firstToLast(int arr[]){
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        firstToLast(arr);
        
    }
    
}
