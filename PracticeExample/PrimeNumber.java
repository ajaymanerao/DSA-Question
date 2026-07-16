package PracticeExample;

public class PrimeNumber{
    public static void primeNumber(int n){
        
        for(int i=1;i<=n;i++){
             int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }

        }
    }


    public static void main(String[] args) {
        primeNumber(100);
        
    }
}