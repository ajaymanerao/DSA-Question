package string;

public class Frequency1 {
    public static void frequencyCount(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            boolean visit=false;
            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                    visit=true;
                    break;
                }
            }
           if(visit)continue;
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            System.out.println(str.charAt(i)+" : "+count);

        }
b


    }


    public static void main(String[] args) {
        String str="AjayAnerao";
        frequencyCount(str);
    }
    
}
