package Array;

import java.util.Arrays;

public class SecondMax {
    public static void secMax(int arr[]){
        Arrays.sort(arr);{
            System.out.println("Second Max Element: "+arr[arr.length-2]);
        }
    }

//-------------Or------------------
    
public static void secondMax(int arr[]){
    int max=arr[0];
    int secMax=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            secMax=max;
            max=arr[i];
        }
    }
    System.out.println("secomg Max Element: "+secMax);

}

    public static void main(String[] args) {
        int arr[]={15,72,48,96,33,81};
        secMax(arr);
        secMax(arr);
    }
    
}
