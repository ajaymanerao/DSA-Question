package Array;

public class Sumoddelement {
    public static void sumOdd(int arr[]){
        int sum=0;
        System.out.print("odd Element: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum +=arr[i];
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println();
        System.out.println(sum);
    } 


    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66};
        sumOdd(arr);

    }
    
}
