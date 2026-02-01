package Array;

import java.util.Arrays;

public class Frequency {
public static void frequency(int arr[]){
  Arrays.sort(arr);
  //11223
  for(int i=0;i<arr.length;i++){
   int count=1;
   while(i<arr.length-1 && arr[i]==arr[i+1]){
    count++;
    i++;
   }

   System.out.println(arr[i]+" "+count);

  }
  

}
    
    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,1};
        frequency(arr);

    }
}
