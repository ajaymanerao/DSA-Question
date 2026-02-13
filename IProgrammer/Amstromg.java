package IProgrammer;

public class Amstromg {
public static void amstrong(int a){
    int original =a;
int num=a;
int digit=0;
while(num!=0){
digit++;
num/=10;
}

int sum=0;
num=a;
while(num!=0){
    int d=num%10;
    sum+=Math.pow(d, digit);
    num /=10;
}

if(sum==original){
    System.out.println("is a Amstrong");
}else{
    System.out.println("is not amstrong");
}
}   


    public static void main(String[] args) {
        int a=1634;
        amstrong(a);

    }
}
