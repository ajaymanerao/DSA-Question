package IProgrammer;

public class PalindromeNumber {
public static void palindromeNumber(int num){
    int original=num;
    int temp=num;
    int rev=0;
    while(temp!=0){
        int d=temp%10;
        rev=rev*10+d;
        temp/=10;
    }
System.out.println(rev);
    if(rev==original){
        System.out.println("it is a palindrome number");
    }else{
        System.out.println("not palindrome");
    }

}

    public static void main(String[] args) {
        int num=121;
        palindromeNumber(num);
    }
    
}
