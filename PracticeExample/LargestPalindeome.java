package PracticeExample;

public class LargestPalindeome {
    public static void largestPalindrome(String str){
        String arr[]=str.split(" ");
        int max=0;
        String str1="";
        for(String word:arr){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
                rev +=word.charAt(i);
            }

            if(word.equals(rev) && word.length()>max){
                max=word.length();
              str1=word;
            }

        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
        String str="I saw madam driving a car while level students were discussing racecar and refer in the classroom";
        largestPalindrome(str);
    }
    
}
