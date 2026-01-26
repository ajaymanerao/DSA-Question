package Array;

public class CaseStudy35 {
    public static void caseStudy(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(arr[i]%2!=0){
                arr[i]=-1;
            }else{
                arr[i]=-2;
            }

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,8,13,20,7};
        caseStudy(arr);
    }
    
}
