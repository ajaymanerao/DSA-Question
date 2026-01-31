package TwoDArray;

public class CountNumber {
public static void countNumber(int arr[][], int key){
    int count=0;
    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
        if(key==arr[i][j]){
            count++;
        }

    }
 }
 System.out.println("Number of 7's time :-- "+count);
}

    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        int key=7;
        countNumber(arr, key);

    }
    
}
