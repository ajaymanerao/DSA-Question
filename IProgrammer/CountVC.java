package IProgrammer;

public class CountVC {
    public static void countVC(String str){
        int vowels=0;
        int consonants=0;
    for(char ch :str.toLowerCase().toCharArray()){
        if(ch >='a' && ch<='z'){
            if("aeiou".indexOf(ch)!=-1){
                vowels++;
            }else{
                consonants++;
            }
        }
    }
    System.out.println("Vowels :"+vowels);
    System.out.println("Consonants "+consonants);
    }


    public static void main(String[] args) {
        String str="programming";
        countVC(str);
    }
    
}
