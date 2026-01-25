package Array;
import java.util.*;
public class ElementGraterThanAvg {
    public static void elementGreaterThenAver(int arr[]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }

        double avg=sum/n;

        for(int i=0;i<arr.length;i++){
            if(avg<arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        } 
        elementGreaterThenAver(arr);
    }
    
}
