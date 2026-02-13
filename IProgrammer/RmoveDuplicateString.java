package IProgrammer;

import java.util.HashSet;

public class RmoveDuplicateString {
public static void rmoveDuplicateString(String str){
   String result="";
    HashSet<Character>set=new HashSet<>();
    for(char x : str.toCharArray()){
        if(!set.contains(x)){
            set.add(x);
            result +=x;

        }
    }
    System.out.println(result);
}


    public static void main(String[] args) {
        String str="programming";
        rmoveDuplicateString(str);
    }
    
}
