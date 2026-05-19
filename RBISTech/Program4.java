package RBISTech;

import java.util.Arrays;

public class Program4 {
    public static void intersection(int arr1[], int arr2[]){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0;i<arr1.length;i++){
    int count1=0;
     for(int k=0;k<arr1.length;k++){
        if(arr1[i]==arr1[k]){
          count1++;
        }
     }
 
     int count2=0;
    for(int j=0;j<arr2.length;j++){
        for(int z=0;z<arr2.length;z++){
        if(arr2[j]==arr2[z]){
        count2++;
        } 
        }
    }

    System.out.println(count1);
    System.out.println(count2);
    if(count1>count2 || count1==count2){
        for(int x=0;x<count2;x++){
            System.out.println(arr1[i]);

        }
    }
}
}



    public static void main(String[] args) {
        int arr1[]={1,1,1,2,2,3};
        int arr2[]={3,2,1,1};
        intersection(arr1, arr2);
    }
    
}
