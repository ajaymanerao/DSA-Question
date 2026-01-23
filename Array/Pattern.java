package Array;

public class Pattern {
    public static void P1(int N){
        
        for(int i=1;i<=N;i++){
            int num= 2*N+i;
            for(int j=1;j<=i;j++){
                System.out.print(num+"\t");
                num=num-(N-j+1);
                

            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}

 
