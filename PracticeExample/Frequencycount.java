package PracticeExample;

public class Frequencycount {
    public static void freCount(String str){
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
            System.out.println(str.charAt(i)+" "+count);
        }
    }
    public static void main(String[] args) {
        String str="aaabbc";
        freCount(str);

    }
    
}
