package collection.ArrayListPro;

import java.util.LinkedList;

public class Program13 {
    public static boolean ispalindrome(LinkedList<Character> list1){

        while(list1.size()>1){
            char first=list1.getFirst();
            char last=list1.getLast();
            if(first != last){
                return false;
            }

            list1.removeFirst();
            list1.removeLast();

            
        }
        return true;

    }
    public static void main(String[] args) {
        LinkedList<Character> list11=new LinkedList<>();
        for(char c: "racecar".toCharArray()){
            list11.add(c);
        }
        LinkedList<Character> list22=new LinkedList<>();
        for(char c: "hello".toCharArray()){
            list22.add(c);
        }

        System.out.println(ispalindrome(list11));
        System.out.println(ispalindrome(list22));
    }
    
}
