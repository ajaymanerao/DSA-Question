package PracticeExample;

public class Amstrong {
    public static void amstrongValid(int num){
        int temp=num;
        int count=0;
        while(temp>0){
            int d=temp%10;
            count++;
            temp/=10;
        }
         
        int sum=0;
        int num1=num;
        while(num1>0){
            int d=num1%10;
            sum+=Math.pow(d, count);
            num1/=10;
        }
        if(sum==num){
            System.out.println("It is a anagram Number");
        }else{
            System.out.println("It is not anagram number");
        }
    }


    public static void main(String[] args) {
        int number=153;
        amstrongValid(number);
        
    }
    
}
