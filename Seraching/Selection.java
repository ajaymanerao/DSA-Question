package Seraching;
public class Selection {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int j=0;j<n-1;j++){
            System.out.println(arr[j]+" ");

        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        selectionSort(arr);
    }
}