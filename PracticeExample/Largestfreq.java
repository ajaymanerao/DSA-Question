package PracticeExample;

public class Largestfreq {
    public static void lrgestFrequency(String str){
        int max=0;
        char largechar=' ';
        for(int i=0;i<=str.length()-1;i++){
            boolean visited=false;
            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                    visited=true;
                    break;
                }
            }

            if(visited)continue;
            int count=1;
            for(int j=i+1;j<str.length();j++){
             if(str.charAt(i)==str.charAt(j)){
                count++;
             }
            }
           
            System.out.println(str.valueOf(str.charAt(i))+count);
            if(count>max){
                max=count;
                largechar=str.charAt(i);
            }
        }
        System.out.println(largechar);
    }

    public static void main(String[] args) {
        String  str="aabbbccceeeeeffeezzz";
        lrgestFrequency(str);
    }
}
