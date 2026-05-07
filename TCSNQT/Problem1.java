package TCSNQT;

import java.util.Scanner;

public class Problem1 {
    public static void employee( int n, int arr[], int target){
        int first=0;
        int last=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                count++;
                if(count==1){
                    first=i+1;
                }
                last=i;
            }

        }
        System.out.println(first+" "+last+" "+count);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int target =sc.nextInt();
        employee(n, arr, target);
        
    }
    
}
