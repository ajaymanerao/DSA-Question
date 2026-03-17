package string;

public class String1 {

    public static void main(String[] args) {

        String s1="KareenaKapoor"; //Slp  //KareenaKapoor
        final String s2="Kareena";
        String s3= s2+"Kapoor"; //Heap    //KareenaKapoor
        System.out.println(s1==s3); //reference
        System.out.println(s1.equals(s3)); //Context
        // System.out.println(s1.compareTo(s3)); //Context










        // String str="Kareena";  //SLP
        // String str1=new String("Karrena"); //Heap
        

        //JVM ----> SLP -----> Heap

        //String str=new StringBuffer().append(s2).append("Kapoor").toString(); ///Heap




    }
    
}
