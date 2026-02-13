package IProgrammer;

public class StringPalindrome {
public static void stringPalindrome(String str){
    String original=str;
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
        rev +=str.charAt(i);
    }

    if(original.equals(rev)){
        System.out.println("Palindrome");
    }else{
        System.out.println("not palindrome");
    }


}


    public static void main(String[] args) {
        String str="madam";
        stringPalindrome(str);
        
    }
    
}
