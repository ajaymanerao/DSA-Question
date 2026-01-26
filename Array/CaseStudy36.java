package Array;

public class CaseStudy36 {
    public static void caseStudy36(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num =arr[i];
            if(num>0){
                System.out.print("Pos ");
            }else if(num<0){
                 System.out.print("Neg ");
            }else{
                 System.out.print("zero ");
            }

             
        }
    }

    public static void main(String[] args) {
        int arr[]={0,-5,12,-3,8,0};
        caseStudy36(arr);
    }
    
}
