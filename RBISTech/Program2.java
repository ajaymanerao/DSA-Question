package RBISTech;

import java.util.Scanner;

public class Program2 {
    public static void missingElement(int arr[], int n){
        int num=n;
        int totalsum=num*(num+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int missingNumber=totalsum-sum;
        System.out.println("MissingNumber : "+missingNumber);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();     
        }
        
        missingElement(arr,n);
    }

    
}
