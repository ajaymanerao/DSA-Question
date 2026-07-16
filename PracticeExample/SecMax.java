package PracticeExample;

public class SecMax {
public static void secMax(int arr[]){
    int max=0;
    int secmax=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            secmax=max;
            max=arr[i];
        }else if(arr[i]>secmax && arr[i]!=max){
            secmax=arr[i];
        }
    }
    System.out.println(max);
    System.out.println(secmax);


}
    

    public static void main(String[] args) {
        int arr[]= {15, 72, 48, 96, 33, 81};
        secMax(arr);
    }
}
