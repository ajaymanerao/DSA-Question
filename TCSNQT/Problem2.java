package TCSNQT;

import java.util.Scanner;

public class Problem2 {
    public static void cable(int V, int S){
        int temp=0;
        int count=0;
        for(int i=1;i<V;i++){
            for(int j=i+1;j<=V;j++){
                 if(temp==S){
                  break;
                }else{
                temp+=(i+j);
                count++;
                }
                
                
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int S=sc.nextInt();
        cable(V,S);
    }
    
}
