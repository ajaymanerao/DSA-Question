public class App {

public void main(String[] args) {
    // int a=10;
    // int b=20;
    // System.out.println(a+b);
    // System.out.println(a-b);
        // System.out.println("10"+20+30);
        // System.out.println(10+"20"+30);
        // System.out.println(10+20+"30");
        // System.out.println("10"+2*6);

        // int a=1200;
        // int rev=0;
        // while(a!=0){
        //     int d=a%10;
        //     rev=rev*10+d;
        //     a/=10;

        // }
        // System.out.println(rev);

        //print("10"+"20"*3); 10202020

        String str="aaabbc";
        for(int i=0;i<str.length();i++){
            boolean value=false;
            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                    value=true;
                    break;
                }
            }
            if(value)continue;
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.print(str.charAt(i)+""+count);
        
        }



}
    
}
