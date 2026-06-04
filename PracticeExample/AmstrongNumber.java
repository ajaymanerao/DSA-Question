package PracticeExample;

public class AmstrongNumber {
    public static void amstrongNumber(int num){
        int n=num;
        int original=num;
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }

        int sum=0;
        while(n!=0){
            int d=n%10;
            int a=(int)Math.pow(d,count);
            sum +=a;
            n/=10;

        }
        System.out.println(sum);
        System.out.println(count);

        if(original==sum){
            System.out.println("Is a amstrong Number");
        }else{
            System.out.println("It is not amstrong number");
        }

    }

    public static void main(String[] args) {
        amstrongNumber(407);
        
    }
    
}
