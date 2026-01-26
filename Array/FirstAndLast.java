package Array;

public class FirstAndLast {
    public static void firstLast(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last=arr[i]%10;
            int num=arr[i];
            while(num>10){
                int d=num%10;
                num /=10;
            }

            arr[i]=num*10+last;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
       }
    }


    public static void main(String[] args) {
        int arr[]={123,235,64,2367};
        firstLast(arr);
    }
    
}
