package RBISTech;

import java.util.Scanner;


public class Program1 {
    public static void reverse(String str){
        String arr[]=str.split(" ");
        for(String word : arr){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
                 rev+=word.charAt(i);
            }
            System.out.print(rev+" ");
        }
         
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverse(str);

    }
    
}
//abbcddeeeef