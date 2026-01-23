package TwoDArray;
import java.util.*;

public class MinNumber {
    public static void minNumber(int arr[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.print("Minimum number is: "+min);
    }


    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        minNumber(arr);

    }
    
}
