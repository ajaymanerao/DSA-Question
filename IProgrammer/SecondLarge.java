package IProgrammer;

public class SecondLarge {
public static void secondLarge(int arr[]){
    int large =arr[0];
    int secLarge=arr[0];
    for(int i=0;i<arr.length-1;i++){
      if(large<arr[i]){
        secLarge=large;
        large=arr[i];
      }
    }
    System.out.println("second large : "+secLarge);
}



    public static void main(String[] args) {
        int arr[]={10, 5, 20, 8};
        secondLarge(arr);
    }
}
