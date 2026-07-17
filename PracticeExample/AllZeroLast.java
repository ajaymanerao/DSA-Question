package PracticeExample;

public class AllZeroLast {
    public static void shiftLast(int arr[]){
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
    }

    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");

    } 
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        shiftLast(arr);

    }
    
}
