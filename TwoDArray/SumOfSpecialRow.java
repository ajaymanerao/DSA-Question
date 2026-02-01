package TwoDArray;

import java.util.Scanner;

public class SumOfSpecialRow {
    public static void SumofSecondRow(int arr[][],int row){
    int m=row;
    int sum=0;
        for(int i=0;i<arr[0].length;i++){
            sum +=arr[row][i];
             

        }

        System.out.println(sum);

    }



    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        SumofSecondRow(arr, row-1);
    }
    
}
