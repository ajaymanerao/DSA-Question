package PracticeExample;

public class PalindromeWord {
    public static void largestPalindrome(String str){
        String arr[]=str.split(" ");
        int max=0;
        String maxPalindrome="";
        for(String s: arr){
            String rev="";
           for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
           }

           if(s.equals(rev)&& s.length()>max){
            max=s.length();
            maxPalindrome=rev;
           }
        }
        System.out.println(maxPalindrome);

    }

    public static void main(String[] args) {
        String str="I saw madam driving a car while level students were discussing racecar and refer in the classroom";
        largestPalindrome(str);

    }
    
}
