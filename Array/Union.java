package Array;
import java.util.*;

public class Union {
    public static void Union(int arr1[], int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        int x=m+n;
        int arr3[]=new int [x];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];

        }
        for(int i=0;i<arr2.length;i++){
            arr3[m+i]=arr2[i];
        }

        Arrays.sort(arr3);
        HashSet<Integer>set=new HashSet<>();
        for(int z:arr3){
            set.add(z);
        
        }
        System.out.print("Union:- ");
        for (int val : set) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Intersection:- ");

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print( +arr1[i]+" ");
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr1[]={1,3,4,5,7};
        int arr2[]={2,3,5,6};
        Union(arr1, arr2);
    }
    
}
