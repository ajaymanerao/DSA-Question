package Array;

public class CaseStudy33 {
    public static void  program1(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num%4==0){
                arr[i]= -1;
            }else if(num%5==0){
                arr[i]=-2;
            }else if(i%4==0 && i%5==0){
               arr[i]= -3;
            } 
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
          
    }

    public static void main(String[] args) {
        int arr[]={10,14,24,12,12,26,20,23,22,15,26};
         program1(arr); 
    }
    
}
