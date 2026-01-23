package TwoDArray;
import java.util.*;

public class FindIndex {
    public static void findIndex(int arr[][],int key){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(key==arr[i][j]){
                    System.out.print("Key is found on the index: ("+i+","+j+")");
                }
            }
            System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        findIndex(arr, 5);


    }
    
}
