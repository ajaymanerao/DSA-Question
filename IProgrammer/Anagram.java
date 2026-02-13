package IProgrammer;

import java.util.Arrays;

public class Anagram {
public static void anagram(String s1, String s2){
    char[] a=s1.toCharArray();
    char[] b=s2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    if(Arrays.equals(a,b)){
        System.out.println("it is Anagram");
    }
}



    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        anagram(s1, s2);
    }
    
}
