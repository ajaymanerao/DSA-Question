package string;

public class LargestPalindrome {
    public static void largestPalindrome(String str){
        String arr[]=str.split(" ");
        int max=0;
        String largest="";
       
        for(String word:arr){
            String rev="";
            
            for(int i=word.length()-1;i>=0;i--){
                rev+=word.charAt(i);
            }
            if(word.equals(rev) && word.length()>max){
            max=word.length();
            largest=word;
            }

        }
        System.out.println(largest);
    }


    
    public static void main(String[] args) {
        String str ="The words level noon and malayalam are palindrome words";
        largestPalindrome(str);
        
    }
    
}
