package string;

public class Frequency {
    public static void checkFrequency(String str){
        String str1=str.toLowerCase();
        for(int i=0;i<str1.length();i++){
            boolean value =false;
            for(int k=0;k<i;k++){
                if(str1.charAt(i)==str1.charAt(k)){
                    value=true;
                    break;
                }
            }
            if(value) continue;
            int count =1;
            for(int j=i+1;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    count++;
                }
            }
            System.out.println(String.valueOf(str.charAt(i))+" "+count);
        }

    }
    public static void main(String[] args) {
        String str="AjayAnerao";
        checkFrequency(str);
        
    }
    
}
