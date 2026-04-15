package string;

public class Palindrome {
public static void checkPalindrome(String str){
      String str1[]=str.split(" ");                                         
      String result=" ";
      for(String word :str1){
        String original=word;

        String rev="";
        char ch[]=word.toCharArray();
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }

        if(original.equals(rev)){
             if (word.length() > result.length()) {
                    result = word;
                }
        }
      }

      System.out.println("Largest Palindrome is :"+result);


}

    public static void main(String[] args) {
        String str="Madam Anna went to level civic racecar event with radar stats and refer kayak solos";
        String str1=str.toLowerCase();
        checkPalindrome(str1);

        
    }
    
}
