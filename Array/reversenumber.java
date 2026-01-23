package Array;

public class reversenumber {
    public static void p1(int num){
    int n=num;
    int rev=0;
    while(n!=0){
        int d=n%10;
        rev=rev*10+d;
        n /=10;

    }
    System.out.println(rev);
    }


    public static void main(String[] args) {
        int num=1234;
        p1(num);
    }
    
}
