package RBISTech;

import java.util.Scanner;

public class Program3 {
    static void findMax(String str){
        // int[] arr = new int[256];

        // for(int i=0;i<str.length();i++){
        //     char ch =  str.charAt(i);
        //     arr[ch]++;
        // }

        // int max = 0;

        // for(int i=0;i<str.length();i++){
        //     char ch1 = str.charAt(i);
        //     if(arr[ch1] > max){
        //         max = arr[ch1];
        //     }
        //     System.out.println(arr[ch1]);
        // }
        // System.out.println(max);


        //  int n=str.length();
        //  int arr[]=new int[n];
        //  for(int i=0;i<str.length();i++){
        //    arr[i]=str.charAt(i);
        //  }
        //  int max=0;
        //  String str1="";

        //  for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=i;j<arr.length;j++){
        //         if(i==j){
        //             count++;
                     
        //         }

        //     }
        //     if(count>max){
        //         max=count;
        //     }
        //  }
        //  System.out.println(max);

        int max=0;
        char maxChar=' ';
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                   count++;
                }
            }
            if(count>max){
                max=count;
                maxChar=str.charAt(i);
            }
        }
        System.out.println(maxChar+" "+max);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        findMax(str);

    }
    
}
