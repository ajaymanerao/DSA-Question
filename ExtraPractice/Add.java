package ExtraPractice;

public class Add {

    void main(){
        //System.out.println(1+1);

        String str1="Ajay";
        String str2="Ajay";
        //System.out.println(str1.equals(str2));


        StringBuffer str3=new StringBuffer("Ajay");
        StringBuffer str4=new StringBuffer("Ajay");
        // System.out.println(str3.equals(str4));
        System.out.println(str3.compareTo(str4));
        System.out.println(str1.contentEquals(str4));
        System.out.println(str3.toString().equals(str4.toString())); // content check instring buffer
        System.out.println(str1.equals(str4));


    }
    
}
