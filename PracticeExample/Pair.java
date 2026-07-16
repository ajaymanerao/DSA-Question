package PracticeExample;

public class Pair {
    public static void findPair(int arr[]){
        int target=20;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+", "+arr[j]+")");
                }
            }
        }
    }

    public static void tipleSum(int arr1[]){
        int target=30;
        for(int i=0;i<arr1.length-2;i++){
            for(int j=i+1;j<arr1.length-1;j++){
                for(int k=j+1;k<arr1.length;k++){
                    if(arr1[i]+arr1[j]+arr1[k]==target){
                        System.out.println("("+arr1[i]+","+arr1[j]+","+arr1[k]+")");
                    }
                    
                }

            }
        }
    }

    public static void findFirst(int arr2[]){
        for(int i=0;i<arr2.length;i++){
            int j=arr2[i];
            while(j>=10){
                j/=10;    
            }
            System.out.print(j+" ");

        }

    }

    public static void findFirstlast(int arr3[]){
        for(int i=0;i<arr3.length;i++){
            int j=arr3[i];
            int d=d=j%10;
            while(j>=10){
                j/=10;    
            }
            j=j*10+d;
            System.out.print(j+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4,8,12,16};
        //findPair(arr);
        int arr1[]={3,6,9,12,15};
        //tipleSum(arr1);
        int arr2[]={123,235,6754,3257,64,2367,288,35,645,374};
        //findFirst(arr2);
        int arr3[]={123,235,6754,3257,64,2367,288,35,645,374};
        findFirstlast(arr3);
    }
    
}
